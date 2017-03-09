package com.mustang.factory.abs;

/**
 * 短信发送工厂
 * Created by Mustang on 17/2/5.
 */
public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
