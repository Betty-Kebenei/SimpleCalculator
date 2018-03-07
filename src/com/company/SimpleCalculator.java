package com.company;

public class SimpleCalculator {

    // BODMAS
    // What is extracted last is calculated first.
    public double calculate(String equation) {
        if(equation.contains("+")){
           return calculateAddition(equation);
        }
        if(equation.contains("-")){
            return calculateSubtraction(equation);
        }
        if(equation.contains("*")){
            return calculateMultiplication(equation);
        }
        if(equation.contains("/")){
            return calculateDivision(equation);
        }
        if(equation.matches("[0-9]+")){
            return Double.parseDouble(equation);
        }
        return Double.NaN;
    }

    private double calculateDivision(String equation) {
        String[] numbers = equation.split("\\/");
        return calculate(numbers[0]) / calculate(numbers[1]);
    }

    private double calculateSubtraction(String equation) {
        String[] numbers = equation.split("-");
        return calculate(numbers[0]) - calculate(numbers[1]);
    }

    private double calculateMultiplication(String equation) {
        String[] numbers = equation.split("\\*");
        return calculate(numbers[0]) * calculate(numbers[1]);
    }

    private double calculateAddition(String equation){
        String[] numbers = equation.split("\\+");
        double sum = 0.0;
        for(String number:numbers){
            sum +=calculate(number);
        }
        return sum;
    }
}
