package com.newfeatures.java8.twoArgumentFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class CreateStudentUsingNameAndRollNo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        BiFunction<String, Integer, Student> studentBiFunction = (name, rollNo) -> new Student(name, rollNo);
        students.add(studentBiFunction.apply("Sahil", 100));
        students.add(studentBiFunction.apply("Rahul", 101));
        students.add(studentBiFunction.apply("Neha", 102));

        students.forEach(student -> {
            System.out.println("Name : " + student.name);
            System.out.println("RollNo : " + student.rollNo);
        });
    }
}
