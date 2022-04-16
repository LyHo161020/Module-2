package com.codegym;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testFizz3() {
        int number = 3;
        String expected = FizzBuzz.FIZZ;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz6() {
        int number = 6;
        String expected = FizzBuzz.FIZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = FizzBuzz.BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz10() {
        int number = 10;
        String expected = FizzBuzz.BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = FizzBuzz.FIZZ_BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = FizzBuzz.FIZZ_BUZZ;

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}
