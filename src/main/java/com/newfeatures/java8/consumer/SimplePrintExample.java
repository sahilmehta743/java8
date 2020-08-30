package com.newfeatures.java8.consumer;

import java.util.function.Consumer;

public class SimplePrintExample {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);

        stringConsumer.accept("sahil");
    }
}
