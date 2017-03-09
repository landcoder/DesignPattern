package com.mustang.factory.abs;

/**
 * 邮件发送工厂
 * Created by Mustang on 17/2/5.
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
