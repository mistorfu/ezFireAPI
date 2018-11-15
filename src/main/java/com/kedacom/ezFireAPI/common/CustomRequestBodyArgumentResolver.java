package com.kedacom.ezFireAPI.common;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

/**
 * Created by fudapeng on 2018/11/7.
 */
public class CustomRequestBodyArgumentResolver implements HandlerMethodArgumentResolver {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(CustomRequestBody.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        if (!request.getContentType().contains("application/json")) {
            return null;
        }

        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[1024];
        int len;
        while ((len = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, len);
        }
        String content = sb.toString().trim();
        if (content.startsWith("{")) content = "[" + content + "]";

        JavaType javaType = this.objectMapper.getTypeFactory().constructCollectionType(
                (Class<? extends Collection>) parameter.getParameterType(),
                (Class<?>) ((ParameterizedType) parameter.getGenericParameterType()).getActualTypeArguments()[0]);
        Object result = this.objectMapper.readValue(content, javaType);

        return result;
    }
}