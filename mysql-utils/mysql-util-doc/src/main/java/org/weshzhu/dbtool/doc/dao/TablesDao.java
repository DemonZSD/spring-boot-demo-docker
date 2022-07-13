package org.weshzhu.dbtool.doc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.weshzhu.dbtool.common.entity.Tables;

import java.util.List;


/**
 * (Tables)表数据库访问层
 *
 * @author zhushidong
 * @since 2022-07-13 09:51:33
 */
@Mapper
public interface TablesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  tableName 主键
     * @return 实例对象
     */
    Tables queryByTableName(@Param("schemaName") String schemaName, @Param("tableName") String tableName );

    /**
     * 查询指定数据库的表清单
     * @param tableSchema 数据库名称
     * @return 表清单
     */
    List<Tables> queryAllBySchema(@Param("tableSchema") String tableSchema);

    /**
     * 统计总行数
     *
     * @param tables 查询条件
     * @return 总行数
     */
    long count(Tables tables);

    /**
     * 新增数据
     *
     * @param tables 实例对象
     * @return 影响行数
     */
    int insert(Tables tables);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tables> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Tables> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tables> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Tables> entities);

    /**
     * 修改数据
     *
     * @param tables 实例对象
     * @return 影响行数
     */
    int update(Tables tables);


}

