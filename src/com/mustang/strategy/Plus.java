package com.mustang.strategy;

/**
 * Desc
 * Created by Mustang on 17/2/21.
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculator(String exp) {
        int[] intArr = split(exp, "\\+");
        return intArr[0] + intArr[1];
    }
}
