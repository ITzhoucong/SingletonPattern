package com.zc.singleton.hungry;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 20:40
 * @description:
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
