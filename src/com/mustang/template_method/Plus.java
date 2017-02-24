package com.mustang.template_method;

/**
 * Desc
 * Created by Mustang on 17/2/24.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
