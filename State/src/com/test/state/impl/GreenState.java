package com.test.state.impl;

import com.test.context.Context;
import com.test.state.State;

/**
 * Desc
 * Created by Mustang on 17/1/22.
 */
public class GreenState implements State {
    @Override
    public void last(Context c) {
        c.setState(new RedState());
    }

    @Override
    public void next(Context c) {
        c.setState(new BlueState());
    }

    @Override
    public String getState() {
        return "green";
    }
}
