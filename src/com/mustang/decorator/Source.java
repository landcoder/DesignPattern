package com.mustang.decorator;

/**
 * Desc
 * Created by Mustang on 17/2/10.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is source method!");
    }
}
