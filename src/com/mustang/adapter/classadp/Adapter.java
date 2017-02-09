package com.mustang.adapter.classadp;

/**
 * 类的适配器
 * Created by Mustang on 17/2/9.
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void targetMethod() {
        System.out.println("this is target method!");
    }

}
