package com.mustang.builder;

/**
 * Desc
 * Created by Mustang on 17/2/5.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail send...");
    }
}
