package org.demonzsd.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeUtils {

    public static final String defaultPattern = "yyyy-MM-dd HH:mm:ss";

    public static String formatDate(Date date, String format){
        format = StringUtils.isEmpty(format) ? defaultPattern: format;
        String result = new SimpleDateFormat(format).format(date);
        return result;
    }

    public static String getNowDT(String pattern){
        return formatDate(new Date(), pattern);
    }

    public static Date getDateByFormat(String pattern, String strDate) throws Exception{
        try {
            pattern = StringUtils.isEmpty(pattern) ? defaultPattern : pattern;
            return new SimpleDateFormat(pattern).parse(strDate);
        } catch (ParseException e) {
            throw new Exception(e);
        }
    }

    public static int getDateDiff(String nowDate, String oldDate, DateTimeUnits dateDiff) throws Exception{
        return getDateDiff(getDateByFormat(defaultPattern, nowDate), getDateByFormat(defaultPattern, oldDate), dateDiff);
    }
    /**
     * 获取时间差
     * @param nowDate 当前时间
     * @param oldDate 历史时间
     * @param dateDiff 时间差单位：日、月、时、秒
     * @return 返回时间差
     */
    public static int getDateDiff(Date nowDate, Date oldDate, DateTimeUnits dateDiff) {
        long diffInMs = nowDate.getTime() - oldDate.getTime();
        int days = (int) TimeUnit.MILLISECONDS.toDays(diffInMs);
        int hours = (int) (TimeUnit.MILLISECONDS.toHours(diffInMs) - TimeUnit.DAYS.toHours(days));
        int minutes = (int) (TimeUnit.MILLISECONDS.toMinutes(diffInMs) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diffInMs)));
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(diffInMs);
        switch (dateDiff) {
            case DAYS:
                return days;
            case SECONDS:
                return seconds;
            case MINUTES:
                return minutes;
            case HOURS:
                return hours;
            case MILLISECONDS:
            default:
                return (int) diffInMs;
        }
    }

    public static void main(String[] args) {
        System.out.println("1111");
        System.out.println(DateTimeUtils.formatDate(new Date(), ""));
        try {
            System.out.println(DateTimeUtils.getDateByFormat("", DateTimeUtils.formatDate(new Date(), "")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
