package com.mustang.iterator;

/**
 * Desc
 * Created by Mustang on 17/2/28.
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection(new String[]{"A","B","C","D","E"});
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
