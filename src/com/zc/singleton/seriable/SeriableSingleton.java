package com.zc.singleton.seriable;

import java.io.Serializable;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 23:33
 * @description:
 */
public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton singleton = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return singleton;
    }

    protected Object readResolve() {
        return singleton;
    }
}
