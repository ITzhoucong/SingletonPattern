package com.zc.singleton.hungry;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 21:07
 * @description:
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
