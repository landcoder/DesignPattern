package com.mustang.bridge;

/**
 * Desc
 * Created by Mustang on 17/2/15.
 */
public abstract class Bridge {

    private Sourceable source;

    protected void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
