package com.newfeatures.java8.predicate.employemanagementapp;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeesSalaryLessThan20000 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sahil", "software engg", 10000, "Gurgoan"));
        employees.add(new Employee("Rahul", "Manager", 20000, "Hyderabad"));
        employees.add(new Employee("Geeta", "software engg", 19000, "Patiala"));
        employees.add(new Employee("Harish", "Manager", 300000, "Gurgoan"));
        Predicate<Employee> employeePredicate = employee -> employee.salary < 20000;
        display(employeePredicate, employees);
    }

    public static void display(Predicate<Employee> employeePredicate, ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            if (employeePredicate.test(employee)) {
                System.out.println(employee);
            }
        }
    }
}
