package com.mustang.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Desc
 * Created by Mustang on 17/2/27.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = observers.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}
