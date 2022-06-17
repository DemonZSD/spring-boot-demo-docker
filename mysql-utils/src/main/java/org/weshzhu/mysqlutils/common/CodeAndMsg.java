package org.weshzhu.mysqlutils.common;

/**
 *
 * @author weshzhu
 */
public enum CodeAndMsg {
    ENGINE_RECOMMEND("1001", "数据库引擎，建议InnoDB"),
    ENGINE_RECOMMEND2("1002", "数据库引擎，建议InnoDB");

    CodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

}
