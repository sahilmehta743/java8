package com.newfeatures.java8.function;

import java.util.function.Function;

public class FunctionIdentityExample {
    public static void main(String[] args) {
        Function<String, String> function = Function.identity();
        System.out.println(function.apply("Sahil"));
    }
}