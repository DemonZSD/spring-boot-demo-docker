package org.weshzhu.dbtool.predicate;

import org.weshzhu.dbtool.common.CodeAndMsg;

import java.util.Map;

public interface DbPredicate {

    Map<String, CodeAndMsg> doCheck(DefinePredicate properties);

}
