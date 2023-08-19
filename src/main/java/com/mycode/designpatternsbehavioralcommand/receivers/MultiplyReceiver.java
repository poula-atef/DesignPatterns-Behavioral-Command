package com.mycode.designpatternsbehavioralcommand.receivers;

public class MultiplyReceiver implements Receiver {

    private int firstNumber;
    private int secondNumber;

    public MultiplyReceiver(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void execute() {
        System.out.println("Multiply Operation Result :: " + (firstNumber * secondNumber));
    }
}
