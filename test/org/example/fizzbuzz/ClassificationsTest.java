package org.example.fizzbuzz;

import static org.example.fizzbuzz.FizzBuzzTest.RANDOM;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClassificationsTest {

    @Test
    void testFizzBuzzProcess() {
        int n = RANDOM.nextInt();
        String expected = "FizzBuzz";
        Object actual = Classifications.FIZZBUZZ.process(n);
        assertEquals(expected, actual);
    }

    @Test
    void testUnchangedProcess() {
        int expected = RANDOM.nextInt();
        Object actual = Classifications.UNCHANGED.process(expected);
        assertEquals(expected, actual);
    }

    @Test
    void testBuzzProcess() {
        int n = RANDOM.nextInt();
        String expected = "Buzz";
        Object actual = Classifications.BUZZ.process(n);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzProcess() {
        int n = RANDOM.nextInt();
        String expected = "Fizz";
        Object actual = Classifications.FIZZ.process(n);
        assertEquals(expected, actual);
    }

}
