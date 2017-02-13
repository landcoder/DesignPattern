package com.mustang.proxy;

/**
 * 代理类
 * Created by Mustang on 17/2/13.
 */
public class Proxy implements Sourceable {

    private Source target;

    public Proxy() {
        this.target = new Source();
    }

    @Override
    public void method() {
        before();
        target.method();
        after();
    }

    private void before() {
        System.out.println("proxy before...");
    }

    private void after() {
        System.out.println("proxy after...");
    }
}
