package com.kedacom.ezFireAPI.common;

/**
 * Created by fudapeng on 2018/5/23.
 */
public enum EsServiceConfigEnum {

    //初始化
    INIT(),

    //社会兴趣点表
    LOG("fire_log_read", "fire_log_write", "a_ez_log", "log", "通用日志", "RZBH", "", ""),
    POI("ez_poi_read", "ez_poi_write", "a_ez_poi", "poi", "社会兴趣点", "XQDBH", "", ""),
    POM("fire_pom_read", "fire_pom_write", "a_ez_pom", "pom", "地图全景图", "TXBH", "", ""),
    FILE("fire_file_read", "fire_file_write", "a_ez_file", "file", "通用图像信息", "TXBH", "", ""),
    XZQY("a_ez_xzqy", "a_ez_xzqy", "a_ez_xzqy", "xzqy", "行政区域", "XZBM", "", ""),
    STATION("fire_station_read", "fire_station_write", "a_ez_station", "station", "交通站点", "ZDBH", "", ""),
    ADDRESS("fire_address_read", "fire_address_write", "a_ez_address", "address", "门址门牌号", "ZZBH", "", ""),

    //基础资源数据表
    DWXX("fire_dwxx_read", "fire_dwxx_write", "a_fire_dwxx", "dwxx", "重点单位", "DWBH", "t_fire_basic", ""),
    MHDW("fire_dwxx_miehuo_read", "fire_dwxx_miehuo_write", "a_fire_dwxx_miehuo", "dwxx", "灭火单位", "DWBH", "t_fire_basic", ""),
    JZXX("fire_jzxx_read", "fire_jzxx_write", "a_fire_jzxx", "jzxx", "建筑信息", "JZBH", "t_fire_basic", ""),
    SHXX("fire_shxx_read", "fire_shxx_write", "a_fire_shxx", "shxx", "石化类信息", "DWBH", "t_fire_basic", ""),
    DZD("fire_dzd_read", "fire_dzd_write", "a_fire_dzd", "dzd", "地震带信息", "DZDBH", "t_fire_basic", ""),
    WXQ("fire_wxq_read", "fire_wxq_write", "a_fire_wxq", "wxq", "危险区信息", "WXQBH", "t_fire_basic", ""),
    HDZ("fire_hdz_read", "fire_hdz_write", "a_fire_hdz", "hdz", "核电站信息", "HDZBH", "t_fire_basic", ""),
    SDZ("fire_sdz_read", "fire_sdz_write", "a_fire_sdz", "sdz", "水电站、水库", "SDZBH", "t_fire_basic", ""),
    YQGX("fire_yqgx_read", "fire_yqgx_write", "a_fire_yqgx", "yqgx", "油气管线", "GXBH", "t_fire_basic", ""),
    GLSD("fire_glsd_read", "fire_glsd_write", "a_fire_glsd", "glsd", "公路隧道", "SDBH", "t_fire_basic", ""),

    //社会联动数据表
    YJLDDW("fire_yjlddw_read", "fire_yjlddw_write", "a_fire_yjlddw", "yjlddw", "应急联动单位", "DWBH", "t_fire_social", ""),
    LQBZDW("fire_lqbzdw_read", "fire_lqbzdw_write", "a_fire_lqbzdw", "lqbzdw", "联勤保障单位", "DWBH", "t_fire_social", ""),
    MHJYZJ("fire_mhjyzj_read", "fire_mhjyzj_write", "a_fire_mhjyzj", "mhjyzj", "灭火救援专家", "SFZH", "t_fire_social", ""),

    //执法监督数据表
    ZFTJ("fire_zftj_read", "fire_zftj_write", "a_fire_zftj", "zftj", "执法统计", "TJBH", "t_fire_law", ""),

    //重大安保活动表
    ABHD("fire_abhd_read", "fire_abhd_write", "a_fire_abhd", "abhd", "安保活动", "HDBH", "t_fire_safe", ""),
    ABCS("fire_abcs_read", "fire_abcs_write", "a_fire_abcs", "abcs", "安保场所", "CSBH", "t_fire_safe", ""),
    ABBS("fire_abbs_read", "fire_abbs_write", "a_fire_abbs", "abbs", "安保部署", "BSBH", "t_fire_safe", ""),
    ABLL("fire_abll_read", "fire_abll_write", "a_fire_abll", "abll", "安保力量", "LLBH", "t_fire_safe", ""),
    ABDT("fire_abdt_read", "fire_abdt_write", "a_fire_abdt", "abdt", "安保动态", "SJBH", "t_fire_safe", ""),
    ABLD("fire_abld_read", "fire_abld_write", "a_fire_abld", "abld", "安保联动", "LDBH", "t_fire_safe", ""),
    ABLX("fire_ablx_read", "fire_ablx_write", "a_fire_ablx", "ablx", "安保路线", "LXBH", "t_fire_safe", ""),
    ABQY("fire_abqy_read", "fire_abqy_write", "a_fire_abqy", "abqy", "安保区域", "QYBH", "t_fire_safe", ""),

    //灭火救援力量表
    XFDW("fire_xfdw_read", "fire_xfdw_write", "a_fire_xfdw", "xfdw", "消防单位", "DWBH", "t_fire_outfire", ""),
    YBDW("fire_ybdw_read", "fire_ybdw_write", "a_fire_ybdw", "ybdw", "应保单位", "DWBH", "t_fire_outfire", ""),
    XFDZ("fire_xfdz_read", "fire_xfdz_write", "a_fire_xfdz", "xfdz", "消防队站", "DZBH", "t_fire_outfire", ""),
    ZYDW("fire_zydw_read", "fire_zydw_write", "a_fire_zydw", "zydw", "专业队伍", "DWBH", "t_fire_outfire", ""),
    DDBD("fire_ddbd_read", "fire_ddbd_write", "a_fire_ddbd", "ddbd", "调度编队", "DWBH", "t_fire_outfire", ""),
    ZYBD("fire_zybd_read", "fire_zybd_write", "a_fire_zybd", "zybd", "增援编队", "DWBH", "t_fire_outfire", ""),
    RYXX("fire_ryxx_read", "fire_ryxx_write", "a_fire_ryxx", "ryxx", "人员信息", "RYBH", "t_fire_outfire", ""),
    RYZT("fire_ryzt_read", "fire_ryzt_write", "a_fire_ryzt", "ryzt", "人员状态", "", "t_fire_outfire", ""),
    CLXX("fire_clxx_read", "fire_clxx_write", "a_fire_clxx", "clxx", "车辆信息", "CLBH", "t_fire_outfire", ""),
    CLZT("", "", "", "clzt", "车辆状态", "CLBH", "t_vehicle_data", "vehStatusInfo:"),
    CLZB("", "", "", "clzb", "车辆装备", "CLBH", "t_vehicle_data", "vehEquipment:"),
    CLDP("", "", "", "cldp", "车辆底盘", "CLBH", "t_vehicle_data", "vehBottomPart:"),
    CLSZ("", "", "", "clsz", "车辆上装", "CLBH", "t_vehicle_data", "vehUpperPart:"),
    ZBXX("fire_zbxx_read", "fire_zbxx_write", "a_fire_zbxx", "zbxx", "装备信息", "XXBH", "t_fire_outfire", ""),
    TZZB("fire_tzzb_read", "fire_tzzb_write", "a_fire_tzzb", "tzzb", "特种装备", "XXBH", "t_fire_outfire", ""),
    XHS("fire_xhs_read", "fire_xhs_write", "a_fire_xhs", "xhs", "市政消防栓", "XHSBH", "t_fire_outfire", ""),
    XFSC("fire_xfsc_read", "fire_xfsc_write", "a_fire_xfsc", "xfsc", "消防水池", "SCBH", "t_fire_outfire", ""),
    XFSH("fire_xfsh_read", "fire_xfsh_write", "a_fire_xfsh", "xfsh", "消防水鹤", "SHBH", "t_fire_outfire", ""),
    QSMT("fire_qsmt_read", "fire_qsmt_write", "a_fire_qsmt", "qsmt", "取水码头", "MTBH", "t_fire_outfire", ""),
    TRSY("fire_trsy_read", "fire_trsy_write", "a_fire_trsy", "trsy", "天然水源", "SYBH", "t_fire_outfire", ""),
    WZCK("fire_wzck_read", "fire_wzck_write", "a_fire_wzck", "wzck", "物资仓库", "CKBH", "t_fire_outfire", ""),
    CBWZ("fire_cbwz_read", "fire_cbwz_write", "a_fire_cbwz", "cbwz", "储备物资", "XXBH", "t_fire_outfire", ""),
    MHYJ("fire_mhyj_read", "fire_mhyj_write", "a_fire_mhyj", "mhyj", "灭火药剂", "XXBH", "t_fire_outfire", ""),

    //警情处置数据表
    ZQXX("fire_zqxx_read", "fire_zqxx_write", "a_fire_zqxx", "zqxx", "灾情信息", "ZQBH", "t_fire_alarm", ""),
    ZQWZ("fire_zqwz_read", "fire_zqwz_write", "a_fire_zqwz", "zqwz", "灾情位置", "WZBH", "t_fire_alarm", ""),
    ZQWX("fire_zqwx_read", "fire_zqwx_write", "a_fire_zqwx", "zqwx", "灾情微信", "XXBH", "t_fire_alarm", ""),
    ZQLY("fire_zqly_read", "fire_zqly_write", "a_fire_zqly", "zqly", "灾情录音", "LYBH", "t_fire_alarm", ""),
    ZQRY("fire_zqry_read", "fire_zqry_write", "a_fire_zqry", "zqry", "灾情人员", "", "t_fire_alarm", ""),
    ZQZL("fire_zqzl_read", "fire_zqzl_write", "a_fire_zqzl", "zqzl", "灾情指令", "ZLBH", "t_fire_alarm", ""),
    ZQWJ("fire_zqwj_read", "fire_zqwj_write", "a_fire_zqwj", "zqwj", "灾情文件", "WJBH", "t_fire_alarm", ""),
    XCXX("fire_xcxx_read", "fire_xcxx_write", "a_fire_xcxx", "xcxx", "现场信息", "XXBH", "t_fire_alarm", ""),
    DPXX("fire_dpxx_read", "fire_dpxx_write", "a_fire_dpxx", "dpxx", "调派信息", "DPBH", "t_fire_alarm", ""),
    ZYXX("fire_zyxx_read", "fire_zyxx_write", "a_fire_zyxx", "zyxx", "请求增援", "QQBH", "t_fire_alarm", ""),
    WDXX("fire_wdxx_read", "fire_wdxx_write", "a_fire_wdxx", "wdxx", "文电信息", "WDBH", "t_fire_alarm", ""),
    WSXX("fire_wsxx_read", "fire_wsxx_write", "a_fire_wsxx", "wsxx", "火场文书", "WSBH", "t_fire_alarm", ""),
    HCDT("fire_hcdt_read", "fire_hcdt_write", "a_fire_hcdt", "hcdt", "火场动态", "XXBH", "t_fire_alarm", ""),
    DXAL("fire_dxal_read", "fire_dxal_write", "a_fire_dxal", "dxal", "典型案例", "ZQBH", "t_fire_alarm", ""),
    QZXX("fire_qzxx_read", "fire_qzxx_write", "a_fire_qzxx", "qzxx", "前指信息", "", "t_fire_alarm", ""),

    //战备值守数据表
    ZBDT("fire_zbdt_read", "fire_zbdt_write", "a_fire_zbdt", "zbdt", "值班动态", "ZBBH", "t_fire_duty", ""),
    ZBKB("fire_zbkb_read", "fire_zbkb_write", "a_fire_zbkb", "zbkb", "值班快报", "KBBH", "t_fire_duty", ""),
    ZYSX("fire_zysx_read", "fire_zysx_write", "a_fire_zysx", "zysx", "重要事项", "SXBH", "t_fire_duty", ""),
    SXYQ("fire_sxyq_read", "fire_sxyq_write", "a_fire_sxyq", "sxyq", "涉消舆情", "YQBH", "t_fire_duty", ""),
    ZQYJ("fire_zqyj_read", "fire_zqyj_write", "a_fire_zqyj", "zqyj", "灾情预警", "YJBH", "t_fire_duty", ""),
    ZQLL("fire_zqll_read", "fire_zqll_write", "a_fire_zqll", "zqll", "执勤力量", "XXBH", "t_fire_duty", ""),
    TQYB("fire_tqyb_read", "fire_tqyb_write", "a_fire_tqyb", "tqyb", "天气预报", "YBBH", "t_fire_duty", ""),

    //人员数据表
    LIFE("", "", "", "", "生命体征", "ZQBH+RYBH", "t_person_data", "personInfo:Life:"),
    BREATH("", "", "", "", "空呼数据", "ZQBH+RYBH", "t_person_data", "personInfo:Breath:"),
    LOCATION("", "", "", "", "室内定位", "ZQBH+RYBH", "t_person_data", "personInfo:Location:"),
    DEVICE("", "", "", "", "人员装备", "ZQBH+RYBH", "t_person_data", "personInfo:Device:"),

    CLWZ("", "", "", "", "车辆位置", "sbbh", "", "vehLocationInfo:"),

    //应急预案
    YJYA("fire_yjya_read","fire_yjya_write","a_fire_yjya","yjya","应急预案","YABH","t_fire_ems",""),
    BNCS("fire_bncs_read","fire_bncs_write","a_fire_bncs","bncs","避难场所","CSBH","t_fire_ems",""),
    SZYL("fire_szyl_read", "fire_szyl_write", "a_fire_szyl", "szyl", "实战演练", "YLBH", "t_fire_ems", ""),
    JYLL("fire_jyll_read","fire_jyll_write","a_fire_jyll","jyll","救援力量","LLBH","t_fire_ems",""),
    DZYD("fire_dzyd_read","fire_dzyd_write","a_fire_dzyd","dzyd","电子运单","YDBH","t_fire_ems",""),
    YDCL("fire_ydcl_read","fire_ydcl_write","a_fire_ydcl","ydcl","运单车辆","XXBH","t_fire_ems","");

    private String read;
    private String write;
    private String index;
    private String type;
    private String desc;
    private String primaryKey;
    private String kafkaTopic;
    private String redisKeyPrefix;

    EsServiceConfigEnum() {
    }

    EsServiceConfigEnum(String read, String write, String index, String type, String desc,
                        String primaryKey, String kafkaTopic, String redisKeyPrefix) {
        this.read = read;
        this.write = write;
        this.index = index;
        this.type = type;
        this.desc = desc;
        this.primaryKey = primaryKey;
        this.kafkaTopic = kafkaTopic;
        this.redisKeyPrefix = redisKeyPrefix;
    }

    public String getRead() {
        return read;
    }

    public String getWrite() {
        return write;
    }

    public String getIndex() {
        return index;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public String getRedisKeyPrefix() {
        return redisKeyPrefix;
    }
}
