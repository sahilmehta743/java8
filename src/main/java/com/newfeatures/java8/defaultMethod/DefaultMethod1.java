package com.newfeatures.java8.defaultMethod;

import java.util.function.Predicate;

public class DefaultMethod1 implements DefaultMethodInterface {
    public static void main(String[] args) {
        DefaultMethod1 defaultMethod1 = new DefaultMethod1();
        defaultMethod1.display();
        // Variable names edited for readability
        Predicate<Integer> integerPredicate = integer -> integer>10;
        System.out.println(integerPredicate.test(1));
    }
}