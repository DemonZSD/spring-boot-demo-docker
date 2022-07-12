package org.weshzhu.mysqlutils.annotation;

import java.lang.annotation.*;

/**
 * @author zhushidong
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PredicateAnnotation {

    /**
     * 所给值，所给值结合表达式{@code expr()} 和{@code rules()} 进行校验
     */
    String value() default "";

    /**
     * 规则集合
     */
    String[] rules();

    /**
     * 级别：suggest(建议)|warn(警告)|enforce(强制)
     */
    String level();

    /**
     * 表达式 : "eq", "in", "not in"
     */
    String expr() default "eq";

}
