package org.weshzhu.dbtool.doc.service;

import org.weshzhu.dbtool.common.entity.Tables;

import java.util.List;

/**
 * @author zhushidong
 */
public interface TableService {
    /**
     *
     * @param schemaName
     * @return
     * @throws Exception
     */
    List<Tables> getTablesBySchemaName(String schemaName) throws Exception;
}
