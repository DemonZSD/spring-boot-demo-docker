package org.weshzhu.dbtool.doc.service;

import org.weshzhu.dbtool.common.entity.Columns;

/**
 * (Columns)表服务接口
 *
 * @author zhushidong
 * @since 2022-07-13 09:59:47
 */
public interface ColumnsService {

    /**
     * 通过ID查询单条数据
     *
     * @param schemaName
     * @param tableName
     * @param columnName
     * @return 实例对象
     */
    Columns queryByColumnName(String schemaName, String tableName, String columnName);

    /**
     * 新增数据
     *
     * @param columns 实例对象
     * @return 实例对象
     */
    Columns insert(Columns columns);

    /**
     * 修改数据
     *
     * @param columns 实例对象
     * @return 实例对象
     */
    Columns update(Columns columns);


}
