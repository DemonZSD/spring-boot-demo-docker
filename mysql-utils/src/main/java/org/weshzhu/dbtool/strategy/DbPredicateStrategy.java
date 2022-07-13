package org.weshzhu.dbtool.strategy;

import org.weshzhu.dbtool.annotation.PredicateAnnotation;
import org.weshzhu.dbtool.common.CheckUtils;
import org.weshzhu.dbtool.entity.PredicateResult;
import org.weshzhu.dbtool.predicate.DefinePredicate;

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
