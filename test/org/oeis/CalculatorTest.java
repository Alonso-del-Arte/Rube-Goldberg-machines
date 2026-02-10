package org.oeis;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private static final Random RANDOM = new Random();

    @Test
    void testIsPowerOfTwo() {
        int power = 1;
        while (power > 0) {
            String msg = power + " should be a power of 2";
            assert Calculator.isPowerOfTwo(power) : msg;
            power <<= 1;
        }
    }

    @Test
    void testIntMinValIsNotPowerOfTwo() {
        int n = Integer.MIN_VALUE;
        String msg = n + " should not be a power of 2";
        assert !Calculator.isPowerOfTwo(n) : msg;
    }

    @Test
    void testNegativeNumberIsNotPowerOfTwo() {
        int n = RANDOM.nextInt(1, Integer.MAX_VALUE) | Integer.MIN_VALUE;
        String msg = n + " should not be a power of 2";
        assert !Calculator.isPowerOfTwo(n) : msg;
    }

    @Test
    void testZeroIsNotPowerOfTwo() {
        String msg = "0 should not be power of 2";
        assert !Calculator.isPowerOfTwo(0) : msg;
    }

    @Test
    void testNotPowerOfTwo() {
        int basis = 2 * RANDOM.nextInt(16, 32) + 1;
        int exponent = RANDOM.nextInt(9, 16);
        int start = basis << exponent;
        int end = start + 128;
        String msgPart = " should not be a power of 2";
        for (int n = start; n < end; n++) {
            String msg = n + msgPart;
            assert !Calculator.isPowerOfTwo(n) : msg;
        }
    }

}
