package org.weshzhu.dbtool.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Schemata)实体类
 *
 * @author zhushidong
 * @since 2022-07-13 09:17:41
 */
@Getter
@Setter
@ToString
public class Schemata implements Serializable {
    private static final long serialVersionUID = 311791263199645460L;
    
    private String catalogName;
    
    private String schemaName;
    
    private String defaultCharacterSetName;
    
    private String defaultCollationName;
    
    private String sqlPath;

}

