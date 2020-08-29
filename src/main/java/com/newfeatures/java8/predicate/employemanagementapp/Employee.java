package com.newfeatures.java8.predicate.employemanagementapp;

public class Employee {
    String name;
    String designation;
    double salary;
    String location;

    public Employee(String name, String designation, double salary, String location) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    public String toString() {
        return String.format("(%s,%s,%.2f,%s)", name, designation, salary, location);
    }
}
