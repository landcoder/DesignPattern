package com.mustang.singleton;

/**
 * 单例模式
 * Created by Mustang on 17/2/4.
 */
public class Singleton {
    private Singleton() {}

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("singleton...");
    }
}
