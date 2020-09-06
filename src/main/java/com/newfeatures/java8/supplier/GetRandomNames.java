package com.newfeatures.java8.supplier;

import java.util.function.Supplier;

public class GetRandomNames {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> {
            String[] strings = {"Sunny","Bunny","Chinny","Vinny"};
            int x = (int) (Math.random() * 4);
            return strings[x];
        };
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
    }
}
