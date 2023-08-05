package com.mycode.designpatternsbehavioralcommand;

import com.mycode.designpatternsbehavioralcommand.commands.AdditionCommand;
import com.mycode.designpatternsbehavioralcommand.commands.MultiplyCommand;
import com.mycode.designpatternsbehavioralcommand.invokers.Calculator;

public class DesignPatternsBehavioralCommandApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.addCommand(new MultiplyCommand(3, 5));

        calculator.performCommand();
    }
}
