package com.mycode.designpatternsbehavioralcommand.commands;

public class AdditionCommand implements Command {

    private int firstNumber;
    private int secondNumber;

    public AdditionCommand(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void execute() {
        System.out.println("Multiply Operation Result :: " + (firstNumber + secondNumber));
    }
}
