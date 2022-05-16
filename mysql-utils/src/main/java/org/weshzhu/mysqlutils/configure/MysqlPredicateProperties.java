package org.weshzhu.mysqlutils.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhushidong
 */
@Component
@ConfigurationProperties(prefix = "mysql-utils.predicate")
public class MysqlPredicateProperties {


}
