package org.weshzhu.mysqlutils.factory;

import org.weshzhu.mysqlutils.strategy.PredicateStrategy;

import java.util.Map;

/**
 * @author zhushidong
 */
public class PredicateStrategyFactory {
    Map<String, PredicateStrategy> predocates;
    public Map<String, PredicateStrategy> createPredicateStrategy(){
        // 进行反射读取 org.weshzhu.mysqlutils.strategy 中的类进行实例化，放入到map中
        this.predocates.put("key", null);
        return this.predocates;
    }
}
