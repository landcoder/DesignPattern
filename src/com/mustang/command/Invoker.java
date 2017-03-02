package com.mustang.command;

/**
 * Desc
 * Created by Mustang on 17/3/2.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }

}
