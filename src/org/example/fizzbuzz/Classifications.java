package org.example.fizzbuzz;

public enum Classifications {

    FIZZBUZZ(n -> "FizzBuzz"),

    UNCHANGED(n -> n),

    BUZZ(n -> "SORRY, NOT IMPLEMENTED YET"),

    FIZZ(n -> "Fizz");

    private final Transformable transformation;

    Object process(int n) {
        return this.transformation.transform(n);
    }

    Classifications(Transformable transformable) {
        this.transformation = transformable;
    }

    @FunctionalInterface
    private interface Transformable {

        Object transform(int n);

    }

}
