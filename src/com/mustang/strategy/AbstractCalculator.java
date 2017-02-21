package com.mustang.strategy;

/**
 * Desc
 * Created by Mustang on 17/2/21.
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String[] arr = exp.split(opt);
        int[] intArr = new int[2];
        intArr[0] = Integer.parseInt(arr[0]);
        intArr[1] = Integer.parseInt(arr[1]);
        return intArr;
    }

}
