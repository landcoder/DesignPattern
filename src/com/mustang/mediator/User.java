package com.mustang.mediator;

/**
 * Desc
 * Created by Mustang on 17/3/8.
 */
public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void work();

}
