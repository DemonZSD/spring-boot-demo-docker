package org.weshzhu.dbtool.configure;

import org.springframework.util.Assert;

import java.util.List;

/**
 * @author zhushidong
 */
public class DatabasePredicateProperties extends PredicateProperties{
    List<String> includeDb;
    List<String> charset;
    String engine;

    public List<String> getIncludeDb() {
        return includeDb;
    }

    public void setIncludeDb(List<String> includeDb) {
        Assert.notEmpty(includeDb, "Specify at least one database name or *!");
        this.includeDb = includeDb;
    }

    public List<String> getCharset() {
        return charset;
    }

    public void setCharset(List<String> charset) {
        this.charset = charset;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
