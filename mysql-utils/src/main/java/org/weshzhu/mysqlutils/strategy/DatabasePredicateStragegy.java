package org.weshzhu.mysqlutils.strategy;

import org.weshzhu.mysqlutils.configure.PredicateProperties;
import org.weshzhu.mysqlutils.entity.PredicateResult;
import org.weshzhu.mysqlutils.predicate.DbPredicate;

public class DatabasePredicateStragegy implements PredicateStrategy{
    PredicateProperties properties;
    @Override
    public boolean test(DbPredicate predicate) {
        // bala bala
        predicate.doCheck(properties);
        return false;
    }

    @Override
    public PredicateResult check(DbPredicate predicate) {
        this.test(predicate);
        return null;
    }
}
