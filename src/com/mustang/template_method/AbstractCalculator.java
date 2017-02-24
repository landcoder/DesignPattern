package com.mustang.template_method;

/**
 * Desc
 * Created by Mustang on 17/2/24.
 */
public abstract class AbstractCalculator {

    public final int calculate(String exp, String opt) {
        int[] array = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    abstract protected int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        String[] array =  exp.split(opt);
        int[] intArr = new int[2];
        intArr[0] = Integer.parseInt(array[0]);
        intArr[1] = Integer.parseInt(array[1]);
        return intArr;
    }

}
