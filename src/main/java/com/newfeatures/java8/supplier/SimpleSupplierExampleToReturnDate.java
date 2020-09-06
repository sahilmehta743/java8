package com.newfeatures.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SimpleSupplierExampleToReturnDate {
    public static void main(String[] args) {
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());
    }
}
