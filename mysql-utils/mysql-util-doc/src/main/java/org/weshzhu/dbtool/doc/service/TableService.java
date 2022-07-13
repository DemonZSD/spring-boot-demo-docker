package org.weshzhu.dbtool.doc.service;

import org.weshzhu.dbtool.common.entity.Table;


import java.util.List;
import java.util.Map;

/**
 *
 * @author zhushidong
 */
public interface TableService {
    /**
     * 根据 schema 名称集合获取 数据库清单 {@code Map} 类型， key为表英文名，value为数据库实例对象
     * @param schemaNames schema 集合名称
     * @return 数据库清单 {@code Map} 类型， key为 schema name，value为数据库实例对象集合
     * @throws Exception 异常
     */
    Map<String, List<Table>> getTablesBySchemaNames(String... schemaNames) throws Exception;

    /**
     * 根据 schema 名称获取 数据库清单 {@code Map} 类型， key为表英文名，value为数据库实例对象
     * @param schemaName schema 名称
     * @return 数据库清单 {@code Map} 类型，key为表英文名，value为数据库实例对象
     * @throws Exception 异常
     */
    Map<String, Table> getTablesBySchemaName(String schemaName) throws Exception;
}
