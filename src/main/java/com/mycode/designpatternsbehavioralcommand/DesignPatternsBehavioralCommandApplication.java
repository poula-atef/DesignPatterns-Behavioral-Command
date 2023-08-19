package com.mycode.designpatternsbehavioralcommand;

import com.mycode.designpatternsbehavioralcommand.receivers.MultiplyReceiver;
import com.mycode.designpatternsbehavioralcommand.commands.Calculator;

public class DesignPatternsBehavioralCommandApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.setReceiver(new MultiplyReceiver(3, 5));

        calculator.perform();
    }
}
