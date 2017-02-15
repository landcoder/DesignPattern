package com.mustang.bridge;

/**
 * Desc
 * Created by Mustang on 17/2/15.
 */
public class MyBridge extends Bridge {

    public void method() {
        getSource().method();
    }

}
