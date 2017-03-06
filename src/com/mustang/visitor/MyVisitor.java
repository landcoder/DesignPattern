package com.mustang.visitor;

/**
 * Desc
 * Created by Mustang on 17/3/5.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject: " + sub.getSubject());
    }
}
