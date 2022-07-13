package org.weshzhu.dbtool.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhushidong
 */
@Component
@ConfigurationProperties(prefix = "mysql-utils.predicate")
public class MysqlPredicateProperties {

    private Database database;


    class Database{
        private String include;
        private CharsetProperty charset;
        private String engin;
    }



}
