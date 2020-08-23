package com.newfeatures.java8.predicate;

import java.util.function.Predicate;

public class DisplayNamesStartsWithKUsingPredicate {
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", "malika", "Katrina", "Kareena"};

        Predicate<String> namesStartsWIthK = name -> name.charAt(0) == 'K';
        for (String name : names) {
            if (namesStartsWIthK.test(name)) {
                System.out.println(name);
            }
        }
    }
}
