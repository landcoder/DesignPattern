package com.mustang.interpreter;

/**
 * Desc
 * Created by Mustang on 17/3/8.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
