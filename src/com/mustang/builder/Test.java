package com.mustang.builder;

/**
 * Desc
 * Created by Mustang on 17/2/6.
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(2);
        builder.produceSmsSender(2);
        System.out.println(builder.getList());
    }

}
