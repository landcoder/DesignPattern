package com.mustang.iterator;

/**
 * Desc
 * Created by Mustang on 17/2/28.
 */
public class MyCollection implements Collection {

    private String[] arrVal;

    /**
     * 存字符串数组的集合
     * @param arrVal
     */
    public MyCollection(String[] arrVal) {
        this.arrVal = arrVal;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return arrVal[index];
    }

    @Override
    public int size() {
        return arrVal.length;
    }
}
