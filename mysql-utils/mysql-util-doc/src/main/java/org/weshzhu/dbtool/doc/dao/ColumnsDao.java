package org.weshzhu.dbtool.doc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.weshzhu.dbtool.common.entity.Columns;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Columns)表数据库访问层
 *
 * @author zhushidong
 * @since 2022-07-13 09:59:37
 */
@Mapper
public interface ColumnsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param schemaName
     * @param tableName
     * @param columnName
     * @return 实例对象
     */
    Columns queryByColumnName(@Param("schemaName")String schemaName,
            @Param("tableName")String tableName,
            @Param("columnName")String columnName);

    /**
     * 根据 schema 获取数据库表中列的清单
     * @param schemaName  schema 名称
     * @return 数据库表中列的清单
     */
    List<Columns> queryBySchema(@Param("schemaName")String schemaName);
    /**
     * 统计总行数
     *
     * @param columns 查询条件
     * @return 总行数
     */
    long count(Columns columns);

    /**
     * 新增数据
     *
     * @param columns 实例对象
     * @return 影响行数
     */
    int insert(Columns columns);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Columns> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Columns> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Columns> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Columns> entities);

    /**
     * 修改数据
     *
     * @param columns 实例对象
     * @return 影响行数
     */
    int update(Columns columns);
}

