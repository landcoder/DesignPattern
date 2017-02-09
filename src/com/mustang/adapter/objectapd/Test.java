package com.mustang.adapter.objectapd;

/**
 * Desc
 * Created by Mustang on 17/2/9.
 */
public class Test {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.sourceMethod();
        target.targetMethod();
    }

}
