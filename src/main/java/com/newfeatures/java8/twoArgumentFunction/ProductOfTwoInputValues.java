package com.newfeatures.java8.twoArgumentFunction;

import java.util.function.BiFunction;

public class ProductOfTwoInputValues {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
        System.out.println(f.apply(4,5));
        System.out.println(f.apply(5, 6));
    }
}
