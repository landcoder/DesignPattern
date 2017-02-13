package com.mustang.proxy;

/**
 * Desc
 * Created by Mustang on 17/2/13.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("source method...");
    }
}
