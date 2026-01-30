package org.example.fizzbuzz;

public enum Classifications {

    FIZZBUZZ(n -> "SORRY, NOT IMPLEMENTED YET"),

    UNCHANGED(n -> "SORRY, NOT IMPLEMENTED YET"),

    BUZZ(n -> "SORRY, NOT IMPLEMENTED YET"),

    FIZZ(n -> "SORRY, NOT IMPLEMENTED YET");

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
