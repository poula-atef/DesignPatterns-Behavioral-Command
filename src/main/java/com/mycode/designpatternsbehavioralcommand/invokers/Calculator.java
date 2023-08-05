package com.mycode.designpatternsbehavioralcommand.invokers;

import com.mycode.designpatternsbehavioralcommand.commands.Command;

public class Calculator {
    private Command command;

    public void addCommand(Command command) {
        this.command = command;
    }

    public void performCommand() {
        command.execute();
    }
}
