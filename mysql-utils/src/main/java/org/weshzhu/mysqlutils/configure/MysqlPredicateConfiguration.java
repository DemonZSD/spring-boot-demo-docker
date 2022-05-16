package org.weshzhu.mysqlutils.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.weshzhu.mysqlutils.predicate.DatabasePredicate;
import org.weshzhu.mysqlutils.predicate.TablePredicate;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhushidong
 */
public class MysqlPredicateConfiguration {

    @Configuration
    @ConditionalOnClass(DatabasePredicate.class)
//    @ConditionalOnMissingBean(DataSource.class)
    @ConditionalOnProperty(name = "mysql-utils.predicate.database", matchIfMissing = true)
    static class DatabasePredicateConfiguration {

        @Bean
        @ConfigurationProperties(prefix = "mysql-utils.predicate.database")
        public DatabasePredicate configDatabasePredicate(MysqlPredicateProperties properties) {
            String include = "";
            List<String> supportCharsets = null;
            String engine = null;

            DatabasePredicateProperties predicateProperties = new DatabasePredicateProperties();
            predicateProperties.setIncludeDb(Arrays.asList(include.split(",")));
            predicateProperties.setCharset(supportCharsets);
            predicateProperties.setEngine(engine);

            DatabasePredicate predicate = null;

            return predicate;
        }

        @Bean
        @ConfigurationProperties(prefix = "mysql-utils.predicate.table")
        public TablePredicate configTablePredicate(MysqlPredicateProperties properties) {
            TablePredicate predicate = null;
            return predicate;
        }

    }

}
