package com.example.practice.predicate;

import java.util.function.Predicate;

public class PredicateDefaultMethodExample {

    public static void main(String[] args) {
        int[] integerItems = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("The numbers greater than 10 are  : ");
        m1(p1, integerItems);
        System.out.println("The numbers not greater than 10 are  : ");
        m1(p1.negate(), integerItems);
        System.out.println("The even numbers are : ");
        m1(p2, integerItems);
        System.out.println("The numbers greater than 10 and even are :");
        m1(p1.and(p2), integerItems);
        System.out.println("The numbers greater than 10 or even are :");
        m1(p1.or(p2), integerItems);
    }

    public static void m1(Predicate<Integer> p, int[] integerItems) {
        for (int integerItem : integerItems) {
            if (p.test(integerItem)) {
                System.out.println(integerItem);
            }
        }
    }
}
