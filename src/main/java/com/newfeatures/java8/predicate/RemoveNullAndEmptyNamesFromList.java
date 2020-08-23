package com.newfeatures.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullAndEmptyNamesFromList {


    public static void main(String[] args) {
        String[] names = {"Sunny", null, "Kajal", "malika", "", "Katrina", null, "Kareena"};
        Predicate<String> removeNullAndEmptyNames = name -> name != null && name.length() != 0;
        ArrayList<String> validNames = new ArrayList<>();
        for (String name : names){
            if (removeNullAndEmptyNames.test(name)){
                validNames.add(name);
            }
        }
        System.out.println("The list of valid names : " );
        System.out.println(validNames);
    }
}
