package com.newfeatures.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + salary;
    }
}

public class GetTotalMonthSalaryOfAllEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populate(employees);
        Function<List<Employee>, Double> function = l -> {
            double totalSalary = 0;
            for (Employee employee : l) {
                totalSalary = totalSalary + employee.salary;
            }
            return totalSalary;
        };
        System.out.println("Total Salary : " + function.apply(employees));
    }

    private static void populate(List<Employee> employees) {
        employees.add(new Employee("Sunny", 1000));
        employees.add(new Employee("Bunny", 2000));
        employees.add(new Employee("Chinny", 3000));
        employees.add(new Employee("Vinny", 4000));
        employees.add(new Employee("Pinny", 5000));
    }
}
