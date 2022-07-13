package org.weshzhu.dbtool.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Tables)实体类
 *
 * @author zhushidong
 * @since 2022-07-13 09:49:58
 */
@Getter
@Setter
@ToString
public class Tables implements Serializable {
    private static final long serialVersionUID = -56693115482993084L;
    
    private String tableCatalog;
    
    private String tableSchema;
    
    private String tableName;
    
    private String tableType;
    
    private String engine;
    
    private Integer version;
    
    private String rowFormat;
    
    private Integer tableRows;
    
    private Integer avgRowLength;
    
    private Integer dataLength;
    
    private Integer maxDataLength;
    
    private Integer indexLength;
    
    private Integer dataFree;
    
    private Integer autoIncrement;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Date checkTime;
    
    private String tableCollation;
    
    private Integer checksum;
    
    private String createOptions;
    
    private String tableComment;

}

