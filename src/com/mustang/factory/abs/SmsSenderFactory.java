package com.mustang.factory.abs;

/**
 * Desc
 * Created by Mustang on 17/2/5.
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
