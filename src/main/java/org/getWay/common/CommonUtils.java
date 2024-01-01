package org.getWay.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

public class CommonUtils {

    public static String getMessage(Exception e) {
        String array[] = e.getMessage().split(":");
        String message = array[array.length - 1].replace("[", "").replace("]", "");
        return message;
    }

}
