package com.mustang.adapter.objectapd;

/**
 * Desc
 * Created by Mustang on 17/2/9.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void sourceMethod() {
        source.sourceMethod();
    }

    @Override
    public void targetMethod() {
        System.out.println("this is the wrapper method!");
    }
}
