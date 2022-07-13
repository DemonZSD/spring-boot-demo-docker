package org.weshzhu.mysqlutils.context;

import org.weshzhu.mysqlutils.listener.PredicateListener;
import org.weshzhu.mysqlutils.strategy.PredicateStrategy;

import java.util.Map;

public class PredicateApplicationContext {

    private Map<String, PredicateStrategy> strategies;
    private Map<String, PredicateListener> listeners;



}
