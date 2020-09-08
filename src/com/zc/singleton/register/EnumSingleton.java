package com.zc.singleton.register;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/17 0:33
 * @description:
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
