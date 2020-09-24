package com.newfeatures.java8.twoArgumentFunction;

import java.util.function.BiPredicate;

public class SumOfTwoNumbersIsEven {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;
        System.out.println(biPredicate.test(10, 20));
        System.out.println(biPredicate.test(12, 13));
    }
}
