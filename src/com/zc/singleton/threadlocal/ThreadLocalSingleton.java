package com.zc.singleton.threadlocal;

/**
 * @ClassName ThreadLocalSingleton
 * @Author 周聪
 * @Date 2020/9/8 21:03
 * @Version 1.0
 * @Description
 */
//伪线程安全
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingleton.get();
    }
}
