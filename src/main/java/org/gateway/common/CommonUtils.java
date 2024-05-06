package org.gateway.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.gateway.dto.ExceptionDto;
import org.gateway.model.ApiData;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.util.*;

public class CommonUtils {

    public static String getMessage(Exception e) {
        String array[] = e.getMessage().split(":");
        String message = array[array.length - 1].replace("[", "").replace("]", "");
        return message;
    }

    public static List<ApiData> getRequestInfo(HttpServletRequest request, ContentCachingRequestWrapper contentCachingRequestWrapper, ContentCachingResponseWrapper contentCachingResponseWrapper) {
        List<ApiData> returnValue = new ArrayList<>();
        returnValue.add(new ApiData("apiInfo", String.format("Method : %s , request Url : %s ", request.getMethod(), request.getRequestURI())));
//        returnValue.add(new ApiData("requestHeader", getRequestHeaderData(request)));
        returnValue.add(new ApiData("requestBody", getRequestData(request, contentCachingRequestWrapper)));
        returnValue.add(new ApiData("responceBody", getBody(contentCachingResponseWrapper.getContentAsByteArray(), "UTF-8")));
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
    private static long get64LeastSignificantBitsForVersion1() {
        Random random = new Random();
        long random63BitLong = random.nextLong() & 0x3FFFFFFFFFFFFFFFL;
        long variant3BitFlag = 0x8000000000000000L;
        return random63BitLong | variant3BitFlag;
    }

    private static long get64MostSignificantBitsForVersion1() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long time_low = (currentTimeMillis & 0x0000_0000_FFFF_FFFFL) << 32;
        final long time_mid = ((currentTimeMillis >> 32) & 0xFFFF) << 16;
        final long version = 1 << 12;
        final long time_hi = ((currentTimeMillis >> 48) & 0x0FFF);
        return time_low | time_mid | version | time_hi;
    }
    public static UUID generateUUID() {
        long most64SigBits = get64MostSignificantBitsForVersion1();
        long least64SigBits = get64LeastSignificantBitsForVersion1();
        return new UUID(most64SigBits, least64SigBits);
    }

    public static ExceptionDto getException(Exception exception) {
        try {
            String[] messageArray = exception.getMessage().split("]:");
            ObjectMapper objectMapper = new ObjectMapper();
            if (messageArray.length > 1) {
                return objectMapper.readValue(messageArray[1].replaceAll("\\[", ""), ExceptionDto.class);
            } else {
                return objectMapper.readValue(messageArray[0].replaceAll("\\[", ""), ExceptionDto.class);
            }
        } catch (Exception e) {
            return null;
        }
    }
}
