package com.mustang.prototype;

import java.io.IOException;

/**
 * Desc
 * Created by Mustang on 17/2/7.
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        Prototype p = (Prototype) prototype.clone();
        System.out.println(p.getString());
        Prototype pp = (Prototype) prototype.deepClone();
        System.out.println(pp.getString());
    }

}
