package org.weshzhu.dbtool.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< Updated upstream
import org.weshzhu.dbtool.predicate.TablePredicate;
=======
>>>>>>> Stashed changes

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

    @Configuration
    public class CharsetPredicate {

        private String level;
        private String[] rules;
    }

}