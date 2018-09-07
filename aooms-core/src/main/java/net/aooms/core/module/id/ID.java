package net.aooms.core.module.id;

import cn.hutool.core.lang.Assert;

import java.io.Serializable;

/**
 * ID
 * Created by cccyb on 2018/9/7
 */
public class ID implements Serializable {

    private Object value;

    public ID(Object value) {
        this.value = value;
    }

    public long longValue(){
        return Long.parseLong(stringValue());
    }

    public String stringValue(){
        Assert.notNull(value,"ID Value cannot be null");
        return value.toString();
    }

    public Object value(){
        return value;
    }
}
