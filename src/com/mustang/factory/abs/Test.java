package com.mustang.factory.abs;

/**
 * Desc
 * Created by Mustang on 17/2/5.
 */
public class Test {

    public static void main(String[] args) {
        /*Provider provider = new SmsSenderFactory();
        Sender sender = provider.produce();
        sender.send(); */
        Provider provider = new MailSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }

}
