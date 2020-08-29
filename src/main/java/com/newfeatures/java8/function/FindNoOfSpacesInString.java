package com.newfeatures.java8.function;

import java.util.function.Function;

public class FindNoOfSpacesInString {

    public static final String SPACE = " ";
    public static final String BLANK = "";

    public static void main(String[] args) {
        String str = "Sahil Mehta lives in chandigarh";
        Function<String, Integer> stringFunction = s1 -> s1.length() - s1.replaceAll(SPACE, BLANK).length();
        System.out.println(stringFunction.apply(str));
    }
}
