package com.example.practice.functionalinterface;

public class ImplementRunnable {

    public static void main(String[] args) {
        Runnable implementRunnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread" + i);
            }
        };

        Thread thread = new Thread(implementRunnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread" + i);
        }
    }
}
