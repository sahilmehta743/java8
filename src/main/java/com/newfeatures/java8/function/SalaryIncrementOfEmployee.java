package com.newfeatures.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrementOfEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populate(employees);
        System.out.println("Before Increment");
        System.out.println(employees);

        Predicate<Employee> employeeSalaryLessThan3500 = employee -> employee.salary < 3500;
        Function<Employee, Employee> incrementSalary = employee -> {
            employee.salary = employee.salary + 477;
            return employee;
        };

        System.out.println("After increment");
        for (Employee employee : employees){
            if (employeeSalaryLessThan3500.test(employee)){
                System.out.println(incrementSalary.apply(employee));
            }
        }
    }

    private static void populate(List<Employee> employees) {
        employees.add(new Employee("Sunny", 1000));
        employees.add(new Employee("Bunny", 2000));
        employees.add(new Employee("Chinny", 3000));
        employees.add(new Employee("Vinny", 4000));
        employees.add(new Employee("Pinny", 5000));
    }
}
