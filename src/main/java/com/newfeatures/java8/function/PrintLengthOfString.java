package com.newfeatures.java8.function;

import java.util.function.Function;

public class PrintLengthOfString {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Sahil"));
        System.out.println(function.apply("Neha"));
    }
}
