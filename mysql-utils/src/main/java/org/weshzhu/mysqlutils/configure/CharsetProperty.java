package org.weshzhu.mysqlutils.configure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CharsetProperty {

    private String level;
    private String[] rules;


}
