package com.mustang.mediator;

/**
 * Desc
 * Created by Mustang on 17/3/8.
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void work() {
        System.out.println("user1 work...");
    }
}
