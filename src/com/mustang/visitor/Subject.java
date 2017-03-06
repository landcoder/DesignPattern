package com.mustang.visitor;

/**
 * Desc
 * Created by Mustang on 17/3/5.
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();

}
