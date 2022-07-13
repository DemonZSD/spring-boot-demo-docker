package org.weshzhu.dbtool.common.util;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Excel 工具类，用于表格数据的写入
 * @author zhushidong
 */
public class ExcelUtil {

    public static void  writeExcel(String excelName, Class clazz, String sheetName, Collection<?> data, String... headName){
        if(headName!=null && headName.length > 0){
            List<List<String>> headList = new ArrayList<>();
            List<String> headsDefy = Arrays.asList(headName);
            headsDefy.forEach(head -> {
                List<String> headsExcel = new ArrayList<>();
                headsExcel.add(head);
                headList.add(headsExcel);
            });
            //TODO 对 clazz中filed个数和headName的个数进行校验。
            EasyExcel.write(excelName, clazz).head(headList).sheet(sheetName).doWrite(data);
        }else {
            throw new IllegalArgumentException(String.format("写入Excel: %s 错误, 表格头不能为空", excelName));
        }
    }

}
