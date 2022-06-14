package org.weshzhu.mysqlutils.predicate;


import org.springframework.util.ClassUtils;
import org.weshzhu.mysqlutils.configure.MysqlPredicateProperties;

public class MysqlPredicateBuilder<T extends MysqlPredicateProperties> {

    private Class<? extends MysqlPredicateProperties> type;

    private ClassLoader classLoader;
    private static final String[] DATA_SOURCE_TYPE_NAMES = new String[] {
            "org.weshzhu.mysqlutils.configure.MysqlPredicateProperties" };
    public T build() {
        Class<? extends MysqlPredicateProperties> type = getType();
        MysqlPredicateProperties result = null;
//        DataSource result = BeanUtils.instantiateClass(type);
//        maybeGetDriverClassName();
//        bind(result);
        return (T) result;
    }
    private Class<? extends MysqlPredicateProperties> getType() {
        Class<? extends MysqlPredicateProperties> type = (this.type != null) ? this.type
                : findType(this.classLoader);
        if (type != null) {
            return type;
        }
        throw new IllegalStateException("No supported PredicateProperties type found");
    }

    public static Class<? extends MysqlPredicateProperties> findType(ClassLoader classLoader) {
        for (String name : DATA_SOURCE_TYPE_NAMES) {
            try {
                return (Class<? extends MysqlPredicateProperties>) ClassUtils.forName(name,
                        classLoader);
            }
            catch (Exception ex) {
                // Swallow and continue
            }
        }
        return null;
    }
}
