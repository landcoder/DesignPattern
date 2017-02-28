package com.mustang.iterator;

/**
 * Desc
 * Created by Mustang on 17/2/28.
 */
public interface Iterator {

    /**
     * 前移
     * @return
     */
    Object previous();

    /**
     * 后移
     * @return
     */
    Object next();

    boolean hasNext();

    /**
     * 第一个
     * @return
     */
    Object first();

}
