package org.weshzhu.mysqlutils.strategy;

import org.weshzhu.mysqlutils.entity.PredicateResult;

public interface PredicateStrategy<T> {

    default PredicateResult check(T t) {
        return null;
    };

}
