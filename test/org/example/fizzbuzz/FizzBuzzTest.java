package org.example.fizzbuzz;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    static final Random RANDOM = new Random(System.currentTimeMillis() << 3);

    @Test
    void testFizzBuzzNegative() {
        int propNum = RANDOM.nextInt() | Integer.MIN_VALUE;
        int remainder = propNum % 15;
        int n = propNum - remainder;
        String expected = "FizzBuzz";
        Object actual = FizzBuzz.fizzBuzz(n);
        String message = "Reckoning FizzBuzz for " + n;
        assertEquals(expected, actual, message);
    }

    @Test
    void testFizzBuzzPositive() {
        int propNum = RANDOM.nextInt() & Integer.MAX_VALUE;
        int remainder = propNum % 15;
        int n = propNum - remainder;
        String expected = "FizzBuzz";
        Object actual = FizzBuzz.fizzBuzz(n);
        String message = "Reckoning FizzBuzz for " + n;
        assertEquals(expected, actual, message);
    }

    @Test
    void testFizzNegative() {
        int adjustment = 3 * RANDOM.nextInt(1, 5);
        int propMult = -15 * RANDOM.nextInt(Short.MAX_VALUE);
        int n = propMult - adjustment;
        String expected = "Fizz";
        Object actual = FizzBuzz.fizzBuzz(n);
        String message = "Reckoning FizzBuzz for " + n;
        assertEquals(expected, actual, message);
    }

    @Test
    void testFizzPositive() {
        int adjustment = 3 * RANDOM.nextInt(1, 5);
        int propMult = 15 * RANDOM.nextInt(Short.MAX_VALUE);
        int n = propMult + adjustment;
        String expected = "Fizz";
        Object actual = FizzBuzz.fizzBuzz(n);
        String message = "Reckoning FizzBuzz for " + n;
        assertEquals(expected, actual, message);
    }

}
