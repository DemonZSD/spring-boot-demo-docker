package org.weshzhu.mysqlutils.predicate;

import org.weshzhu.mysqlutils.common.CodeAndMsg;
import org.weshzhu.mysqlutils.configure.PredicateProperties;

import java.util.Map;

public interface DbPredicate {

    Map<String, CodeAndMsg> doCheck(PredicateProperties properties);

}
