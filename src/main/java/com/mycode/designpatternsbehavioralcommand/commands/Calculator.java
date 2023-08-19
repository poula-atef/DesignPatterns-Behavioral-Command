package com.mycode.designpatternsbehavioralcommand.commands;

import com.mycode.designpatternsbehavioralcommand.receivers.Receiver;
import lombok.Data;

@Data
public class Calculator implements Command {

    private Receiver receiver;

    @Override
    public void perform() {
        receiver.execute();
    }

}
