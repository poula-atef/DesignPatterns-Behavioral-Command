package com.mycode.designpatternsbehavioralcommand.receivers;

public class AdditionReceiver implements Receiver {

    private int firstNumber;
    private int secondNumber;

    public AdditionReceiver(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public void execute() {
        System.out.println("Addition Operation Result :: " + (firstNumber + secondNumber));
    }
}
