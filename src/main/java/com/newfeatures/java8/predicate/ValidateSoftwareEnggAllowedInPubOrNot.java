package com.newfeatures.java8.predicate;

import java.util.function.Predicate;

class SoftwareEngineer {
    String name;
    int age;
    boolean isHavingGf;

    SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    public String toString() {
        return name;
    }

}

public class ValidateSoftwareEnggAllowedInPubOrNot {


    public static void main(String[] args) {
        SoftwareEngineer[] softwareEngineers = {new SoftwareEngineer("Sahil", 20, true),
                new SoftwareEngineer("Rahul", 16, true),
                new SoftwareEngineer("Geeta", 54, false)};
        Predicate<SoftwareEngineer> engineerPredicate = softwareEngineer -> softwareEngineer.age > 18 && softwareEngineer.isHavingGf;

        for (SoftwareEngineer softwareEngineer : softwareEngineers) {
            if (engineerPredicate.test(softwareEngineer)) {
                System.out.println(softwareEngineer);
            }
        }
    }
}
