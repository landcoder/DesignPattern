package com.mustang.decorator;

/**
 * Desc
 * Created by Mustang on 17/2/10.
 */
public class Test {

    public static void main(String[] args) {
        Sourceable sourceable = new Decorator(new Source());
        sourceable.method();
    }

}
