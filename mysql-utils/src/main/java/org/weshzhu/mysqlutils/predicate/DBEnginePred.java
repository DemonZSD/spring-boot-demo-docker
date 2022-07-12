package org.weshzhu.mysqlutils.predicate;

import org.weshzhu.mysqlutils.annotation.PredicateAnnotation;
import org.weshzhu.mysqlutils.common.CheckLevel;
import org.weshzhu.mysqlutils.common.CodeAndMsg;
import org.weshzhu.mysqlutils.common.Constants;
import org.weshzhu.mysqlutils.configure.DatabasePredicateProperties;
import org.weshzhu.mysqlutils.configure.PredicateProperties;

import java.util.Map;

//TODO 进行校验
@PredicateAnnotation(rules="InnoDB", level="200", expr = "=")
public class DBEnginePred implements DbPredicate {

    @Override
    public Map<String, CodeAndMsg> doCheck(PredicateProperties properties) {
        PredicateAnnotation annotion = this.getClass().getAnnotation(PredicateAnnotation.class);
        String[] rules = annotion.rules();
        String level = annotion.level();
        String expr = annotion.expr();
        if()

        return null;
    }
}
