package org.weshzhu.dbtool.predicate;

import org.weshzhu.dbtool.annotation.PredicateAnnotation;
import org.weshzhu.dbtool.common.CodeAndMsg;
import org.weshzhu.dbtool.common.Constants;
import org.weshzhu.dbtool.configure.PredicateProperties;

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
