package com.mustang.factory.basic;

/**
 * 短信发送者
 * Created by Mustang on 17/2/5.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms send...");
    }
}
