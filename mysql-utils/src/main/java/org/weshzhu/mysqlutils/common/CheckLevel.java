package org.weshzhu.mysqlutils.common;

public enum CheckLevel {
    OFF(0),
    WARN(100),
    ERROR(200);
    private final int intLevel;
    private CheckLevel(int val) {
        this.intLevel = val;
    }

    public int intLevel() {
        return this.intLevel;
    }
}
