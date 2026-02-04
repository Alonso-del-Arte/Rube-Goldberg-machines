package org.example.fizzbuzz;

public class FizzBuzz {

    public static final Classifications[] CLASSIFS = Classifications.values();

    public static Object fizzBuzz(int n) {
        int remainder = n % 15;
        int square = (remainder * remainder) % 15;
        try {
            return CLASSIFS[square].process(n);
        } catch (ArrayIndexOutOfBoundsException excOuter) {
            try {
                return CLASSIFS[square - 3].process(n);
            } catch (ArrayIndexOutOfBoundsException excMiddle) {
                try {
                    return CLASSIFS[square - 6].process(n);
                } catch (ArrayIndexOutOfBoundsException excInner) {
                    return CLASSIFS[square - 8].process(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("NOT IMPLEMENTED YET");
    }

}
