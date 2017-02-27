package com.mustang.observer;

/**
 * Desc
 * Created by Mustang on 17/2/27.
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        Observer o1 = new Observer1();
        Observer o2 = new Observer2();
        subject.add(o1);
        subject.add(o2);
        subject.operation();
        subject.del(o1);
        subject.operation();
    }

}
