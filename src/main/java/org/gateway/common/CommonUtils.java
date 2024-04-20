package org.gateway.common;

import jakarta.servlet.http.HttpServletRequest;
import org.gateway.model.ApiData;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class CommonUtils {

    public static String getMessage(Exception e) {
        String array[] = e.getMessage().split(":");
        String message = array[array.length - 1].replace("[", "").replace("]", "");
        return message;
    }

    public static List<ApiData> getRequestInfo(HttpServletRequest request, ContentCachingRequestWrapper contentCachingRequestWrapper, ContentCachingResponseWrapper contentCachingResponseWrapper) {
        List<ApiData> returnValue = new ArrayList<>();
        returnValue.add(new ApiData("apiInfo", String.format("Method : %s , request Url : %s ", request.getMethod(), request.getRequestURI())));
        returnValue.add(new ApiData("requestHeader", getRequestHeaderData(request)));
        returnValue.add(new ApiData("requestBody", getRequestData(request, contentCachingRequestWrapper)));
        returnValue.add(new ApiData("responceBody", getBody(contentCachingResponseWrapper.getContentAsByteArray(), contentCachingResponseWrapper.getCharacterEncoding())));
        return returnValue;
    }

    public static String getRequestHeaderData(HttpServletRequest request) {
        String str = "";
        Enumeration<String> headerNames = request.getHeaderNames();
        if (!isNull(headerNames)) {
            while (headerNames.hasMoreElements()) {
                String name = headerNames.nextElement();
                if (name.toLowerCase().startsWith("x-")) {
                    str += name + ":" + request.getHeader(name) + "\n";
                }
            }
        }
        return str;
    }

    public static boolean isNull(Object o) {
        if (o instanceof String) {
            if (o == null ||
                    ((String) o).isEmpty() ||
                    ((String) o).isBlank() ||
                    ((String) o).length() == 0 ||
                    ((String) o).toLowerCase().trim().equals("null"))
                return true;
            return false;
        }
        return o == null ? true : false;
    }

    public static String getRequestData(HttpServletRequest request, ContentCachingRequestWrapper contentCachingRequestWrapper) {
        String str = "";
        for (String key : request.getParameterMap().keySet()) {
            str += key + ":" + request.getParameter(key) + "\n";
        }
        str += getBody(contentCachingRequestWrapper.getContentAsByteArray(), contentCachingRequestWrapper.getCharacterEncoding());
        return str;
    }

    public static String getBody(byte[] contentAsByteArray, String characterEncoding) {
        try {
            return new String(contentAsByteArray, 0, contentAsByteArray.length, characterEncoding);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }
}
