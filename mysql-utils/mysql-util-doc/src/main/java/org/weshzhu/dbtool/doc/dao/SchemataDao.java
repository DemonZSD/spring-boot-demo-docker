package org.weshzhu.dbtool.doc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.weshzhu.dbtool.common.entity.Schemata;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Schemata)表数据库访问层
 *
 * @author zhushidong
 * @since 2022-07-13 09:26:43
 */
@Mapper
public interface SchemataDao {

    /**
     * 通过schemaName查询单条数据
     *
     * @param  schemaName 主键
     * @return 实例对象
     */
    Schemata queryBySchemaName(@Param("schemaName") String schemaName);

    /**
     * 统计总行数
     *
     * @param schemata 查询条件
     * @return 总行数
     */
    long count(Schemata schemata);

    /**
     * 新增数据
     *
     * @param schemata 实例对象
     * @return 影响行数
     */
    int insert(Schemata schemata);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Schemata> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Schemata> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Schemata> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Schemata> entities);

    /**
     * 修改数据
     *
     * @param schemata 实例对象
     * @return 影响行数
     */
    int update(Schemata schemata);


}

