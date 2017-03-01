package com.mustang.chain_of_responsibility;

/**
 * Desc
 * Created by Mustang on 17/3/1.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
