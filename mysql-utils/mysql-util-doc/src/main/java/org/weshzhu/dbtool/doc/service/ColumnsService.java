package org.weshzhu.dbtool.doc.service;

import org.weshzhu.dbtool.common.entity.Columns;

import java.util.List;

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
     * 根据数据库名称，获取数据库表字段清单
     * @param schemaName 数据库名称
     * @return 数据库表字段清单
     */
    List<Columns> queryBySchema(String schemaName);

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
