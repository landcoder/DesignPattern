package com.mustang.bridge;

/**
 * Desc
 * Created by Mustang on 17/2/15.
 */
public class Test {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        Sourceable source1 = new SubSource1();
        bridge.setSource(source1);
        bridge.method();

        Sourceable source2 = new SubSource2();
        bridge.setSource(source2);
        bridge.method();
    }

}
