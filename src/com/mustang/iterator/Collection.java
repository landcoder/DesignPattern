package com.mustang.iterator;

/**
 * Desc
 * Created by Mustang on 17/2/28.
 */
public interface Collection {

    Iterator iterator();

    Object get(int index);

    int size();

}
