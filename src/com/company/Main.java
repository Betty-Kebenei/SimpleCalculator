package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("Please enter the equation that you want to compute");
        Scanner input = new Scanner(System.in);
        String equation = input.next();
        double result = calculator.calculate(equation);
        System.out.println(result);
    }
}
