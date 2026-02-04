# Commentaries

A Rube Goldberg machine performs a simple task in a complicated way.

Normally, test-driven development (TDD) helps guard against over-engineering, 
which is what we want in a Rube Goldberg machine. But we can actually use TDD to 
create programs that are both more complicated than absolutely necessary but  
also work correctly.

First, we use TDD to create the normal version of the program that correctly 
performs the specified task in as simple a manner as we can manage. Once we're 
satisfied with the normal version, we refactor to the complicated version, 
confident that if our overly complicated version messes things up, the tests 
will alert us.

## FizzBuzz

The infamous integer counting exercise in which multiples of 3 are replaced by 
"Fizz", multiples of 5 are replaced by "Buzz" and multiples of 15 are replaced 
by "FizzBuzz".

The easiest, most obvious way to implement this in Java uses a simple 
Switch-Case statement. But as the idea is to make this the FINISH WRITING

```
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
            case 0:
                return "FizzBuzz";
            default:
                return n;
        }
    }
```

With Java Switch expressions, you can condense this to 

```
    public static Object fizzBuzz(int n) {
        return switch (n % 15) {
            case -12, -9, -6, -3, 3, 6, 9, 12 -> "Fizz";
            case -10, -5, 5, 10 -> "Buzz";
            case 0 -> "FizzBuzz";
            default -> n;
        };
    }
```

It works correctly, but it's not at all amusing. This is what I've come up for 
the Rube Goldberg:

```
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
```

For any practical purpose, it would be a bad idea to nest Try-Catch statements 
at all. But here I hope that it is amusing.

The array `CLASSIFS` comes from `Classifications.values()`, which is an 
enumerated type with the following members: `FIZZBUZZ`, `UNCHANGED`, `BUZZ` and 
`FIZZ`, in that order. Each of these has an associated lambda that that takes an 
integer and returns either a `String` with the expected word or the integer 
unchanged.

The order of the enumerated type is important, because it corresponds almost 
perfectly to $n^2 \pmod{15}$.
