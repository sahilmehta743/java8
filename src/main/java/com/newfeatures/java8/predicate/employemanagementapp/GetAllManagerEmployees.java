package com.newfeatures.java8.predicate.employemanagementapp;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GetAllManagerEmployees {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sahil", "software engg", 300000,"Gurgoan"));
        employees.add(new Employee("Rahul", "Manager", 300000,"Hyderabad"));
        employees.add(new Employee("Geeta", "software engg", 300000,"Patiala"));
        employees.add(new Employee("Harish", "Manager", 300000,"Gurgoan"));
        Predicate<Employee> employeePredicate = employee -> employee.designation.equals("Manager");
        display(employeePredicate,employees);
    }
    //Overide equals method in employee class
    public static void display(Predicate<Employee> employeePredicate, ArrayList<Employee> employees) {
        for (Employee employee: employees){
            if(employeePredicate.test(employee)){
                System.out.println(employee);
            }
        }
    }
}
