package com.newfeatures.java8.testSameDefaultMethodInTwoInterface;

public interface Left {
    default void m1(){
        System.out.println("Left Interface");
    }
}
