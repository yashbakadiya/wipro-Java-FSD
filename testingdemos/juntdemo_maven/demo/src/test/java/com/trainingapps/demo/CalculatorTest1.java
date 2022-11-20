package com.trainingapps.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


public class CalculatorTest1 {
    Calculator spy;
    Adder adder;

    @BeforeEach
    public void setup() {
        adder = mock(Adder.class);
        Calculator calculator = new Calculator(adder);
        spy = spy(calculator);

    }


    /**
     * scenario : number is positive
     * input: 6
     * expectation: 16
     */
    @Test
    public void testAddBy10_1() {
        int input = 6;
        when(adder.add(input, 10)).thenReturn(16);
        int expected = 16;
        int result = spy.addBy10(input);
        assertEquals(expected, result);
        verify(adder).add(6, 10);
    }

    /**
     * scenario : number is negative
     * input : -3
     * expectation : -7
     */
    @Test
    public void testAddBy10_2() {
        int input = -3;
        when(adder.add(input, 10)).thenReturn(-7);
        int expected = -7;
        int result = spy.addBy10(input);
        assertEquals(expected, result);
        verify(adder).add(input, 10);
    }

    @Test
    public void testMutiplyBy10_1() {
        int num = 5;
        doReturn(50).when(spy).multiply(num, 10);
        int expected = 50;
        int result = spy.multiplyBy10(num);
        assertEquals(expected, result);
        verify(spy).multiply(num, 10);
    }

}
