package org.example.fizzbuzz;

public class FizzBuzz {

    public static Object fizzBuzz(int n) {
        return switch (n % 15) {
            case -12, -9, -6, -3, 3, 6, 9, 12 -> "Fizz";
            case -10, -5, 5, 10 -> "Buzz";
            case 0 -> "FizzBuzz";
            default -> n;
        };
    }

    public static void main(String[] args) {
        System.out.println("NOT IMPLEMENTED YET");
    }

}
