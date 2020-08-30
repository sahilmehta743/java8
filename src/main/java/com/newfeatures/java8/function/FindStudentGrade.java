package com.newfeatures.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FindStudentGrade {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        populate(students);
        Function<Student, String> function = student -> {
            int marks = student.marks;
            String grade;
            if (marks >= 80) {
                grade = "A";
            } else if (marks >= 60) {
                grade = "B";
            } else if (marks >= 50) {
                grade = "C";
            } else if (marks >= 35) {
                grade = "D";
            } else {
                grade = "E";
            }
            return grade;
        };

        for (Student student : students) {
            System.out.println("Name " + student.name);
            System.out.println("Marks " + student.marks);
            System.out.println(function.apply(student));
        }
    }

    public static void populate(List<Student> students) {
        students.add(new Student("Sunny", 100));
        students.add(new Student("Bunny", 65));
        students.add(new Student("Chinny", 55));
        students.add(new Student("Vinny", 45));
        students.add(new Student("Pinny", 22));
    }

}
