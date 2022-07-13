package org.weshzhu.dbtool.entity;

import org.weshzhu.dbtool.common.CodeAndMsg;

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
