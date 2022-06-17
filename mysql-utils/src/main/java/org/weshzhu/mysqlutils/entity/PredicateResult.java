package org.weshzhu.mysqlutils.entity;

import org.weshzhu.mysqlutils.common.CodeAndMsg;

import java.util.Map;

/**
 * @author zhushidong
 */
public class PredicateResult {
    public String ruleName;
    public String ruleId;
    /**
     * 级别以及信息描述
     */
    public Map<String, CodeAndMsg> levelAndCodeAndMsg;


}
