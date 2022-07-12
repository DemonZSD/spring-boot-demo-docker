package org.weshzhu.mysqlutils.common;

public enum CheckLevel {
    OFF("0"),
    WARN("100"),
    ERROR("200");
    private final String checkLevel;
    private CheckLevel(String checkLevel) {
        this.checkLevel = checkLevel;
    }

    public String checkLevel() {
        return this.checkLevel;
    }
}
