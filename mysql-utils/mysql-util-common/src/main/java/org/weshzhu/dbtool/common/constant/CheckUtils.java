package org.weshzhu.dbtool.common.constant;

import org.springframework.util.StringUtils;

import java.util.Arrays;

public class CheckUtils {

    public static boolean check(String value, String expression, String ... expire){
        Object[] exp = Arrays.stream(expire).toArray();
        switch (expression){
            case "eq":
            case "=":
            case "==":
                return exp.length > 0 ? value.equals(exp[0]) : StringUtils.isEmpty(value);
            case "in":
                if(StringUtils.isEmpty(value)){
                    return false;
                }
            default:
                return false;
        }
    }

}
