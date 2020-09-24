package com.newfeatures.java8.twoArgumentFunction;

import java.util.function.BiFunction;

class Employee {
    int eno;
    String name;
    double dailyWage;

    public Employee(int eno, String name, double dailyWage) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
    }
}

class TimeSheet {
    int eno;
    int days;

    public TimeSheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }
}

public class CalculateMonthlySalaryOfEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Sahil", 1500);
        TimeSheet timeSheet = new TimeSheet(101, 25);
        BiFunction<Employee, TimeSheet, Double> function = (emp, time) -> emp.dailyWage * time.days;

        System.out.println(function.apply(employee, timeSheet));
    }
}
