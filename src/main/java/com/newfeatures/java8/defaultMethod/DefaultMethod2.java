package com.newfeatures.java8.defaultMethod;

public class DefaultMethod2 implements DefaultMethodInterface {
    public void display() {
        System.out.println("Class DefaultMethod2");
    }

    public static void main(String[] args) {
        DefaultMethod2 defaultMethod2 = new DefaultMethod2();
        defaultMethod2.display();
    }
}
