package com.newfeatures.java8.TestSameDefaultMethodInTwoInterface;

public interface Right {
    default void m1(){
        System.out.println("Right Interface");
    }
}
