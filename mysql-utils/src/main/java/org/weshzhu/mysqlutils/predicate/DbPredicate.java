package org.weshzhu.mysqlutils.predicate;

import org.weshzhu.mysqlutils.common.CodeAndMsg;

import java.util.Map;

public interface DbPredicate {

    Map<String, CodeAndMsg> doCheck(DefinePredicate properties);

}
