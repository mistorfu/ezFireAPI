package com.kedacom.ezFireAPI.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hankcs.hanlp.HanLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by fudapeng on 2018/5/22.
 */
public class Utils {
    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    /**
     * 转化Map为实体类
     *
     * @param type
     * @param map
     * @return
     * @throws Exception
     */
    public static Object convertMapToObject(Class type, Map map) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        Object obj = type.newInstance();

        Map<String, Field> fieldMap = new HashMap<String, Field>();
        Field[] fields = type.getDeclaredFields();
        for (Field f : fields) {
            fieldMap.put(f.getName(), f);
        }

        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < propertyDescriptors.length; i++) {
            PropertyDescriptor descriptor = propertyDescriptors[i];
            String propertyName = descriptor.getName();
            String PROPERTYNAME = descriptor.getName().toUpperCase();

            if (map != null && (map.containsKey(propertyName) || map.containsKey(PROPERTYNAME))) {
                Object value = map.get(propertyName);
                if (value == null) value = map.get(PROPERTYNAME);
                Object[] args = new Object[1];

                Method setMethod = descriptor.getWriteMethod();
                Class<?> paramType = setMethod.getParameterTypes()[0];
                if (paramType.getName().equals("java.lang.Integer")) {
                    if (!StringUtils.isEmpty(value))
                        args[0] = Integer.parseInt(value.toString());
                } else if (paramType.getName().startsWith("com") && value != null) {
                    try {
                        if (value.getClass().getName().equals("java.util.ArrayList")) {
                            ArrayList tempList = (ArrayList) value;
                            if (tempList.size() > 0) {
                                value = tempList.get(0);
                                logger.info(paramType.getName() + " convert not completed.");
                            } else {
                                continue;
                            }
                        }
                        args[0] = convertMapToObject(paramType, (Map) value);
                    } catch (Exception e) {
                        throw new RuntimeException(paramType.getName() + " convert failed");
                    }
                } else if (paramType.getName().equals("java.util.List") && value != null) {
                    ArrayList tempList = null;
                    if (value.getClass().getName().equals("java.util.ArrayList")) {
                        tempList = (ArrayList) ((ArrayList) value).clone();
                    } else {
                        tempList = new ArrayList();
                        tempList.add(value);
                    }

                    if (tempList.size() > 0) {
                        Type genericType = fieldMap.get(propertyName).getGenericType();
                        if (genericType != null && genericType instanceof ParameterizedType && tempList.get(0) instanceof Map) {
                            Class<?> genericClazz = (Class<?>) ((ParameterizedType) genericType).getActualTypeArguments()[0];
                            value = new ArrayList();
                            for (int j = 0; j < tempList.size(); j++) {
                                Object subValue = tempList.get(j);
                                subValue = convertMapToObject(genericClazz, (Map) subValue);
                                ((ArrayList) value).add(subValue);
                            }
                        } else if (tempList.get(0) instanceof Map) {
                            value = new ArrayList();
                            for (int j = 0; j < tempList.size(); j++) {
                                Object subValue = tempList.get(j);
                                subValue = mapLower((Map) subValue);
                                ((ArrayList) value).add(subValue);
                            }
                        }
                    }
                    args[0] = value;
                } else {
                    args[0] = value;
                }

                try {
                    descriptor.getWriteMethod().invoke(obj, args);
                } catch (IllegalArgumentException e) {
                    if (paramType.getName().equals("java.lang.String")) {
                        args[0] = new ObjectMapper().writeValueAsString(args[0]);
                        descriptor.getWriteMethod().invoke(obj, args);
                    }
                }
            }
        }
        return obj;
    }

    private static Map<String, Object> mapLower(Map oriMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        for (Object key : oriMap.keySet()) {
            map.put(key.toString().toLowerCase(), oriMap.get(key));
        }
        return map;
    }

    /**
     * 转化实体类为Map
     *
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> convertObjectToMap(Object obj) throws Exception {
        if (obj == null)
            return null;

        Map<String, Object> map = new HashMap<String, Object>();

        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Boolean isShapeNull = false;
        Double jd = null;
        Double wd = null;
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter != null ? getter.invoke(obj) : null;

            Method setMethod = property.getWriteMethod();
            Class<?> paramType = setMethod.getParameterTypes()[0];
            String name = paramType.getName();

            if (value == null && key.equals("shape")) {
                isShapeNull = true;
            } else if (key.equals("jd")) {
                jd = (Double) value;
            } else if (key.equals("wd")) {
                wd = (Double) value;
            }
            if (value != null && name.equals("java.util.List")) {
                if (value instanceof ArrayList) {
                    Object temp = ((ArrayList) value).clone();
                    ArrayList tempList = (ArrayList) temp;
                    if (tempList.size() != 0) {
                        String tempType = tempList.get(0).getClass().toString();
                        if (tempType.startsWith("class com")) {
                            ((ArrayList) value).clear();
                            for (int i = 0; i < tempList.size(); i++) {
                                Object subValue = tempList.get(i);
                                subValue = convertObjectToMap(subValue);
                                ((ArrayList) value).add(subValue);
                            }
                        }
                    }
                }
            }
            if (value != null && value.getClass().getName().startsWith("com") && !value.getClass().getName().endsWith("InnerShape") && !value.getClass().getName().endsWith("InnerAllShape") && !value.getClass().getName().endsWith("InnerMultiShape")) {
                value = convertObjectToMap(value);
            }
            if (value != null) {
                map.put(key.toUpperCase(), value);
            }
        }
        if (isShapeNull && jd != null && wd != null) {
            Map shape = new HashMap();
            shape.put("coordinates", Arrays.asList(jd, wd));
            shape.put("type", "point");
            map.put("SHAPE", shape);
        }

        return map;
    }

    /**
     * 获取全拼
     *
     * @param str
     * @return
     */
    public static String pinyinString(String str) {
        String pinyin = "";

        if (str != null && !str.equals("")) {
            pinyin = HanLP.convertToPinyinString(str, "", false);
        }
        return pinyin.toUpperCase();
    }

    /**
     * 获取简拼
     *
     * @param str
     * @return
     */
    public static String pinyinFirstCharString(String str) {
        String pinyin = "";
        if (str != null && !str.equals("")) {
            StringBuffer jc = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= '\u4E00' && c <= '\u9FFF') {
                    jc.append(HanLP.convertToPinyinFirstCharString(c + "", "", false));
                } else {
                    jc.append(c);
                }
            }
            pinyin = jc.toString();
        }
        return pinyin.toUpperCase();
    }

    /**
     * 获取全拼、简拼集合
     *
     * @param str
     * @return
     */
    public static List<String> pinyinList(String str) {
        List<String> list = new ArrayList<String>();
        if (str != null && !str.equals("")) {
            list.add(pinyinString(str));
            list.add(pinyinFirstCharString(str));
            list.add(str.toUpperCase());
        }
        return list;
    }

    /**
     * 获取两点之间的 距离
     *
     * @param lon1 起点经度
     * @param lat1 起点纬度
     * @param lon2 终点经度
     * @param lat2 终点纬度
     * @return 距离，单位米
     */
    public static double getSphericalDistance(double lon1, double lat1, double lon2, double lat2) {
        double EarthRadius = 6371.393; //6378.137;

        double radLon1 = lon1 / 180 * Math.PI;
        double radLon2 = lon2 / 180 * Math.PI;
        double radLat1 = lat1 / 180 * Math.PI;
        double radLat2 = lat2 / 180 * Math.PI;
        double distance = 2 * Math.asin(Math.sqrt(Math.pow((Math.sin((radLat1 - radLat2) / 2)), 2) +
                Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin((radLon1 - radLon2) / 2), 2))) * EarthRadius * 1000;

        return Math.round(distance);
    }
}
