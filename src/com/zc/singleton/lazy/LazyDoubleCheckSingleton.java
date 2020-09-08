package com.zc.singleton.lazy;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 22:58
 * @description:
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    //    适中方案
    //    双重检查锁
    public static LazyDoubleCheckSingleton getInstance() {

        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
