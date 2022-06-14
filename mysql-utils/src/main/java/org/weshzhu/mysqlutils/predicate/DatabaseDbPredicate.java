package org.weshzhu.mysqlutils.predicate;

import org.weshzhu.mysqlutils.common.CodeAndMsg;
import org.weshzhu.mysqlutils.configure.DatabasePredicateProperties;
import org.weshzhu.mysqlutils.configure.PredicateProperties;

import java.util.Map;

//TODO 进行校验
public class DatabaseDbPredicate implements DbPredicate {

    private DatabasePredicateProperties properties;

    public DatabasePredicateProperties getProperties() {
        return properties;
    }

    public void setProperties(DatabasePredicateProperties properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, CodeAndMsg> doCheck(PredicateProperties properties) {
        return null;
    }
}
