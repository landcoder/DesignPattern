package com.mustang.factory.basic;

/**
 * 多工厂方法
 * Created by Mustang on 17/2/5.
 */
public class MoreSendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
