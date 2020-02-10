package model;

// implementing interface to override methods
public class CalculatorModel implements Calculator {


    private double firstNumber;
    private double secondNumber;

    public CalculatorModel(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    public double addition() {
        return firstNumber + secondNumber;
    }

    public double subtraction() {
        return firstNumber - secondNumber;
    }

    public double multiplication() {
        return firstNumber * secondNumber;
    }

    public double division() {
        return firstNumber / secondNumber;
    }

}