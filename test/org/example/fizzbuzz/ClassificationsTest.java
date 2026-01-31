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

}
