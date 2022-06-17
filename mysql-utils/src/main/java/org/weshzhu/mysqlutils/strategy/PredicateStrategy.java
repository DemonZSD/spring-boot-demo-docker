package org.weshzhu.mysqlutils.strategy;

import org.weshzhu.mysqlutils.entity.PredicateResult;
import org.weshzhu.mysqlutils.predicate.DbPredicate;

import java.util.function.Predicate;


/**
 * @author zhushidong
 */
public interface PredicateStrategy extends Predicate<DbPredicate> {

    /**
     * 对规则进行检查，检查结果放入 {@code PredicateResult} 对象中
     * @param predicate 待检查规约
     * @return 检查结果
     */
    PredicateResult check(DbPredicate predicate);

}
