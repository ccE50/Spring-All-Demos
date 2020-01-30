package com.zmz.core.config.datasource.annotation;

/**
 * @author ASNPHDG
 * @create 2020-01-13 3:24 PM
 */
public enum DataSourceEnum {

    MASTER("db1"),SLAVE("db2");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}