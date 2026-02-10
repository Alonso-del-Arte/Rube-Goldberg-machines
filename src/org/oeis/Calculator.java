package org.oeis;

import java.math.BigInteger;

public class Calculator {

    // TODO: Write tests for this
    public static BigInteger fibonacci(int index) {
        return BigInteger.TEN;
    }
    
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }

    // TODO: Write tests for this
    public static boolean isPrime(int n) {
        return false;
    }

}
