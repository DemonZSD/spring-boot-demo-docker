package org.weshzhu.mysqlutils.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.weshzhu.mysqlutils.predicate.DBEnginePred;
import org.weshzhu.mysqlutils.predicate.TablePredicate;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhushidong
 */
@Configuration
@ConditionalOnProperty(name = "mysql-utils.predicate.database", matchIfMissing = true)
public class MysqlPredicateConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "mysql-utils.predicate.database")
    public DatabasePredicateProperties configDatabasePredicate(MysqlPredicateProperties properties) {
        String include = "";
        List<String> supportCharsets = null;
        String engine = null;

        DatabasePredicateProperties predicateProperties = new DatabasePredicateProperties();
        predicateProperties.setIncludeDb(Arrays.asList(include.split(",")));
        predicateProperties.setCharset(supportCharsets);
        predicateProperties.setEngine(engine);
        return predicateProperties;
    }

    @Bean
    @ConfigurationProperties(prefix = "mysql-utils.predicate.table")
    public TablePredicate configTablePredicate(MysqlPredicateProperties properties) {
        TablePredicate predicate = null;
        return predicate;
    }

    @Configuration
    public class CharsetPredicate {

        private String level;
        private String[] rules;
    }

}