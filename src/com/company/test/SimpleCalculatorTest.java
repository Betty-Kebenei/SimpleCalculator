package com.company.test;

import com.company.SimpleCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    private static final double DELTA = 0.01;
    private SimpleCalculator calculator;

    @BeforeEach
    public void beforeEachTest(){
        calculator = new SimpleCalculator();
    }

    @Test
    public void WhenIHaveAStringOfOneThenIGetADoubleOne(){
        String equation = "1";
        double expectedResults = 1.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfTwoThenIGetADoubleTwo(){
        String equation = "2";
        double expectedResults = 2.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfOnePlusOneThenIGetADoubleTwo(){
        String equation = "1+1";
        double expectedResults = 2.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfOnePlusOnePlusOneThenIGetADoubleThree(){
        String equation = "1+1+1";
        double expectedResults = 3.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfOnePlusOnePlusOnePlusOneThenIGetADoubleFour(){
        String equation = "1+1+1+1";
        double expectedResults = 4.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfTwoTimesTwoPlusOneThenIGetADoubleFour(){
        String equation = "2*2";
        double expectedResults = 4.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfTwoMinusOnePlusOneThenIGetADoubleOne(){
        String equation = "2-1";
        double expectedResults = 1.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void WhenIHaveAStringOfFourDivideOnePlusOneThenIGetADoubleTwo(){
        String equation = "4/2";
        double expectedResults = 2.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }
    @Test
    public void bodmasCalculation(){
        String equation = "3+4*5-6/2";
        double expectedResults = 20.0;

        double actualResults = calculator.calculate(equation);

        assertEquals(expectedResults, actualResults, DELTA);
    }

}
