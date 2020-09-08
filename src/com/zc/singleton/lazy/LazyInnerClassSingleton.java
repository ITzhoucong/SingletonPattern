package com.zc.singleton.lazy;

/**
 * @author: ZhouCong
 * @date: Create in 2020/7/16 23:02
 * @description:
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
