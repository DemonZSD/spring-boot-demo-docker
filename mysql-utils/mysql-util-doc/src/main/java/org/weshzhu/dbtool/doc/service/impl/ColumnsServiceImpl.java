package org.weshzhu.dbtool.doc.service.impl;

import org.weshzhu.dbtool.common.entity.Columns;
import org.weshzhu.dbtool.doc.dao.ColumnsDao;
import org.weshzhu.dbtool.doc.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Columns)表服务实现类
 *
 * @author zhushidong
 * @since 2022-07-13 09:59:47
 */
@Service("columnsService")
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsDao columnsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param schemaName 数据库名称
     * @param tableName 表名称
     * @param columnName 列名称
     * @return 实例对象
     */
    @Override
    public Columns queryByColumnName(String schemaName, String tableName, String columnName) {
        return this.columnsDao.queryByColumnName(schemaName, tableName, columnName);
    }


    /**
     * 新增数据
     *
     * @param columns 实例对象
     * @return 实例对象
     */
    @Override
    public Columns insert(Columns columns) {
        this.columnsDao.insert(columns);
        return columns;
    }

    /**
     * 修改数据
     *
     * @param columns 实例对象
     * @return 实例对象
     */
    @Override
    public Columns update(Columns columns) {
        this.columnsDao.update(columns);
        return this.queryByColumnName(columns.getTableSchema(), columns.getTableName(), columns.getColumnName());
    }

}
