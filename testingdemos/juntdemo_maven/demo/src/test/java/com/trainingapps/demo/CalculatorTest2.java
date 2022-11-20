package com.trainingapps.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest2 {
    @Mock
    Adder adder;
    @Spy
    @InjectMocks
    Calculator spy;



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
