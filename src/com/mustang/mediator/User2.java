package com.mustang.mediator;

/**
 * Desc
 * Created by Mustang on 17/3/8.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void work() {
        System.out.println("user2 work...");
    }
}
