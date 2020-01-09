package com.camaiot.git.prueba.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() throws Exception {
        Double actual = calculator.add(Double.valueOf(2), Double.valueOf(2));
        Double expected = Double.valueOf(4);
        assertEquals(expected, actual);
    }

    @Test
    public void substract() throws Exception {
        Double actual = calculator.substract(Double.valueOf(7), Double.valueOf(5));
        Double expected = Double.valueOf(2);
        assertEquals(expected, actual);
    }

}