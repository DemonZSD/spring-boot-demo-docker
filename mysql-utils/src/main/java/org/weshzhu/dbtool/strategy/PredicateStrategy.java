package org.weshzhu.dbtool.strategy;

import org.weshzhu.dbtool.entity.PredicateResult;

public interface PredicateStrategy<T> {

    default PredicateResult check(T t) {
        return null;
    };

}
