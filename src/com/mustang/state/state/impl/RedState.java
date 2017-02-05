package com.mustang.state.state.impl;

import com.mustang.state.context.Context;
import com.mustang.state.state.State;

/**
 * Desc
 * Created by Mustang on 17/1/22.
 */
public class RedState implements State {
    @Override
    public void last(Context c) {
        c.setState(new BlueState());
    }

    @Override
    public void next(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public String getState() {
        return "red";
    }
}
