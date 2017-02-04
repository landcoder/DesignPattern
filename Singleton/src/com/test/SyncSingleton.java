package com.test;

/**
 * 同步同步单例对象
 * Created by Mustang on 17/2/4.
 */
public class SyncSingleton {

    private SyncSingleton() {}

    private static SyncSingleton instance = null;

    public static SyncSingleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new SyncSingleton();
                }
            }
        }
        return instance;
    }

}
