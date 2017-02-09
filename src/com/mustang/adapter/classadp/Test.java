package com.mustang.adapter.classadp;

/**
 * Desc
 * Created by Mustang on 17/2/9.
 */
public class Test {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.sourceMethod();
        target.targetMethod();
    }

}
