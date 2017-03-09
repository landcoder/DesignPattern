package com.mustang.factory.basic;

/**
 * 普通工厂方法模式：1、普通工厂，2、多方法工厂，3、静态方法工厂
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
