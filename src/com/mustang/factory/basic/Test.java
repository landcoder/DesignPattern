package com.mustang.factory.basic;

/**
 * Desc
 * Created by Mustang on 17/2/5.
 */
public class Test {
    public static void main(String[] args) {
        new SendFactory().produce("sms").send();
        new SendFactory().produce("mail").send();

        new MoreSendFactory().produceMail().send();
        new MoreSendFactory().produceSms().send();
    }

}
