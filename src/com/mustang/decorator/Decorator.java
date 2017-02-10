package com.mustang.decorator;

/**
 * 装饰类
 * Created by Mustang on 17/2/10.
 */
public class Decorator implements Sourceable {

    private Source source;

    Decorator(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before method...... ");
        source.method();
        System.out.println("after method...... ");
    }
}
