package com.newfeatures.java8.function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> function1 = str -> str.toUpperCase();
        Function<String, String> function2 = str -> str.substring(0, 9);

        System.out.println(function1.andThen(function2).apply("Sahil Mehta"));
        System.out.println(function1.compose(function2).apply("Sahil Mehta"));
    }
}
