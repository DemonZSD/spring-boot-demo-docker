package org.weshzhu.mysqlutils.predicate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zsd
 */
@Setter
@Getter
@ToString
public class DefinePredicate {
    public String value;
    private String [] rules;
    private String level;
    private String expr;
    private String msg;

}
