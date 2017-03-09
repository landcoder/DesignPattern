package com.mustang.factory.basic;

/**
 * 普通工厂
 * Created by Mustang on 17/2/5.
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("null send...");
            return null;
        }
    }

}
