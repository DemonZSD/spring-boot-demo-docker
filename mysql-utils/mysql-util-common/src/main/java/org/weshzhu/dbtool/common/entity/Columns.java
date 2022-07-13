package org.weshzhu.dbtool.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Columns)实体类
 *
 * @author zhushidong
 * @since 2022-07-13 09:59:44
 */
@Getter
@Setter
@ToString
public class Columns implements Serializable {
    private static final long serialVersionUID = 743285573056103819L;

    private String tableCatalog;

    /**
     * 数据库名称
     */
    private String tableSchema;

    /**
     * 表名称
     */
    private String tableName;

    private String columnName;

    private Integer ordinalPosition;

    private String columnDefault;

    private String isNullable;

    private String dataType;

    private Integer characterMaximumLength;

    private Integer characterOctetLength;

    private Integer numericPrecision;

    private Integer numericScale;

    private Integer datetimePrecision;

    private String characterSetName;

    private String collationName;

    private String columnType;

    private String columnKey;

    private String extra;

    private String privileges;

    private String columnComment;

    private String generationExpression;
}

