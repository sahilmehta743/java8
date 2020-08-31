package com.newfeatures.java8.defaultMethod.testSameDefaultMethodInTwoInterface;

public interface Right {
    default void m1(){
        System.out.println("Right Interface");
    }
}
