package com.test.context;

import com.test.state.State;

/**
 * Desc
 * Created by Mustang on 17/1/22.
 */
public class Context {
    public Context() {
    }

    public Context(State state) {
        this.state = state;
    }

    private State state;

    public String push() {
        state.last(this);
        return state.getState();
    }

    public String pull() {
        state.next(this);
        return state.getState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
