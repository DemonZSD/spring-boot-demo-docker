package org.weshzhu.mysqlutils.predicate;

import org.weshzhu.mysqlutils.configure.DatabasePredicateProperties;

//TODO 进行校验
public class DatabasePredicate {

    private DatabasePredicateProperties properties;


    public DatabasePredicateProperties getProperties() {
        return properties;
    }

    public void setProperties(DatabasePredicateProperties properties) {
        this.properties = properties;
    }
}
