package com.newfeatures.java8.predicate;

import com.newfeatures.java8.predicate.employemanagementapp.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("Sahil", "software engg", 10000, "Gurgoan");
        employees.add(employee1);
        Predicate<Employee> employeePredicate = Predicate.isEqual(new Employee("Sahil", "software engg", 10000, "Gurgoan"));
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
