package com.newfeatures.java8.function;

import java.util.function.Function;

public class DiffFunctionComposeAndThenMethods {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = integer -> integer + integer;
        Function<Integer, Integer> function2 = integer -> integer * integer * integer;

        System.out.println(function1.andThen(function2).apply(2)); // function1 = 2 + 2 function2 = 4 * 4 * 4 = 64
        System.out.println(function1.compose(function2).apply(2));// function2 = 2 * 2 * 2 = 8 function1 = 8 + 8 = 16
    }
}
