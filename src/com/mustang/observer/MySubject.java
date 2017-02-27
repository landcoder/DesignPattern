package com.mustang.observer;

/**
 * Desc
 * Created by Mustang on 17/2/27.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update myself");
        notifyObservers();
    }
}
