package com.mustang.interpreter;

/**
 * 解释器模式用来做各种各样的解释器
 *
 * 这里计算了20-(9+2)
 * Created by Mustang on 17/3/8.
 */
public class Test {

    public static void main(String[] args) {
        int result = new Minus().interpret(new Context(20,new Plus().interpret(new Context(9,2))));
        System.out.println(result);
    }

}
