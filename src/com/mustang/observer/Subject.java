package com.mustang.observer;

/**
 * Desc
 * Created by Mustang on 17/2/27.
 */
public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void notifyObservers();

    void operation();

}
