package com.newfeatures.java8.consumer;

import java.util.function.Consumer;

class Exam {
    String name;
    String result;

    Exam(String name, String result) {
        this.name = name;
        this.result = result;
    }
}

public class ConsumerChainingExample {

    public static void main(String[] args) {
        Consumer<Exam> consumer1 = movie -> System.out.println("Movie c1 : " + movie.name);
        Consumer<Exam> consumer2 = movie -> System.out.println("Movie c2 : " + movie.name);
        Consumer<Exam> consumer3 = movie -> System.out.println("Movie c3 : " + movie.name);

        Consumer<Exam> consumer = consumer1.andThen(consumer2).andThen(consumer3);

        consumer.accept(new Exam("Math", "Pass"));
    }
}
