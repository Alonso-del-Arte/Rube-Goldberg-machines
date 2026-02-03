package org.example.fizzbuzz;

public class FizzBuzz {

    public static Object fizzBuzz(int n) {
        switch (n % 15) {
            case -12:
            case -9:
            case -6:
            case -3:
            case 3:
            case 6:
            case 9:
            case 12:
                return "Fizz";
            case -10:
            case -5:
            case 5:
            case 10:
                return "Buzz";
            default:
                return "FizzBuzz";
        }
    }

    public static void main(String[] args) {
        System.out.println("NOT IMPLEMENTED YET");
    }

}
