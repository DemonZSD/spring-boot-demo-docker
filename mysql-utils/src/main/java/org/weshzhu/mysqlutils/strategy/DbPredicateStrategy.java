package org.weshzhu.mysqlutils.strategy;

import org.weshzhu.mysqlutils.annotation.PredicateAnnotation;
import org.weshzhu.mysqlutils.common.CheckUtils;
import org.weshzhu.mysqlutils.entity.PredicateResult;
import org.weshzhu.mysqlutils.predicate.DefinePredicate;

import java.util.Arrays;

/**
 * @author zhushidong
 */
@PredicateAnnotation(name = "存储引擎", value = "InnoDB", rules = {"", ""}, level = "")
public class DbPredicateStrategy implements PredicateStrategy<DefinePredicate> {
    @Override
    public PredicateResult check(DefinePredicate definePredicate) {

        Boolean result = CheckUtils.check(definePredicate.getValue(),definePredicate.getExpr(),definePredicate.getRules());

        new PredicateResult();

        return null;
    }
}
