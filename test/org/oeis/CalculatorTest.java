package org.oeis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testIsPowerOfTwo() {
        int power = 1;
        while (power > 0) {
            String msg = power + " should be a power of 2";
            assert Calculator.isPowerOfTwo(power) : msg;
            power <<= 1;
        }
    }

}
