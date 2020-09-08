package com.zc.singleton.lazy;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 21:37
 * @description:
 */
public class LazySimpleSingleton {

    private volatile static LazySimpleSingleton lazySingleton = null;

    private LazySimpleSingleton() {
    }

    //    适中方案
//    双重检查锁
    public static LazySimpleSingleton getInstance() {

        if (lazySingleton == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySimpleSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
