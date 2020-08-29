package com.newfeatures.java8.function;

import java.util.function.Function;

public class PrintSquareOfANumber {
    public static void main(String[] args) {
        Function<Integer, Integer> integerFunction = integer -> integer*integer;
        System.out.println(integerFunction.apply(5));
        System.out.println(integerFunction.apply(6));
    }
}
