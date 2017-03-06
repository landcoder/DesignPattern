package com.mustang.visitor;

/**
 * Desc
 * Created by Mustang on 17/3/6.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
