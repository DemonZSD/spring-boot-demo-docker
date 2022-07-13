package org.weshzhu.dbtool.factory;


import org.weshzhu.dbtool.strategy.PredicateStrategy;

import java.util.Map;

/**
 * @author zhushidong
 */
public class PredicateStrategyFactory {

    // 1. 通过反射获取注解类；
    // 2. 通过扫描配置文件进行校验；

    Map<String, PredicateStrategy> predicates;
    public Map<String, PredicateStrategy> createPredicateStrategy(){
        // 进行反射读取 org.weshzhu.mysqlutils.strategy 中的类进行实例化，放入到map中
        this.predicates.put("key", null);
        return this.predicates;
    }
}
