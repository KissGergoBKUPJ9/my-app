package hu.me.java;

public class Calculator {
    public static Integer add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Invalid input, arguments cannot be null!");
        }
        return a + b;
    }
}

