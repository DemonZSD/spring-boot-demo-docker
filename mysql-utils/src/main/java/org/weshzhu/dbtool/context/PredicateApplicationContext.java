package org.weshzhu.dbtool.context;

import org.weshzhu.dbtool.listener.PredicateListener;
import org.weshzhu.dbtool.strategy.PredicateStrategy;

import java.util.Map;

public class PredicateApplicationContext {

    private Map<String, PredicateStrategy> strategies;
    private Map<String, PredicateListener> listeners;



}
