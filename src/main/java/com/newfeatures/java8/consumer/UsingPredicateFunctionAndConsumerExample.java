package com.newfeatures.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class UsingPredicateFunctionAndConsumerExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        populate(students);
        Predicate<Student> studentPredicate = student -> student.marks >= 60;
        Function<Student, String> stringFunction = student -> {
            int marks = student.marks;
            String grade = null;
            if (marks >= 80) {
                grade = "A";
            } else if (marks >= 60) {
                grade = "B";
            } else if (marks >= 50) {
                grade = "C";
            } else if (marks >= 35) {
                grade = "D";
            }
            return grade;
        };

        Consumer<Student> studentConsumer = student -> {
            System.out.println("Name : " + student.name);
            System.out.println("Marks : " + student.marks);
            System.out.println("Grade : " + stringFunction.apply(student));
        };

        for (Student student : students){
            if (studentPredicate.test(student)){
                studentConsumer.accept(student);
            }
        }
    }

    private static void populate(List<Student> students) {
        students.add(new Student("Sunny", 100));
        students.add(new Student("Bunny", 65));
        students.add(new Student("Chinny", 55));
        students.add(new Student("Vinny", 45));
        students.add(new Student("Pinny", 25));
    }
}
