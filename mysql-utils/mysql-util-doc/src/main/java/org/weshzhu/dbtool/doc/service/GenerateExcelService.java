package org.weshzhu.dbtool.doc.service;

public interface GenerateExcelService {

    /**
     *
     * @param fileName
     * @param schemaName
     * @throws Exception
     */
    void generateExcel(String fileName, String schemaName) throws Exception;

}
