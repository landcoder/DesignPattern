package com.mustang.singleton;

/**
 * Desc
 * Created by Mustang on 17/2/5.
 */
public class Test {
    public static void main(String[] args) {
        Singleton.getInstance().print();
        PerfectSingleton.getInstance().print();
        SyncSingleton.getInstance().print();
    }
}
