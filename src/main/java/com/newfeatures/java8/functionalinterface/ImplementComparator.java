package com.newfeatures.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImplementComparator {

    public static void main(String[] args) {
        List<Integer> items = getItems();
        Comparator<Integer> comparator = (i1, i2)  -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
        Collections.sort(items, comparator);
        items.stream().forEach(System.out::println);
    }

    private static List<Integer> getItems() {
        List<Integer> items = new ArrayList<>();
        items.add(20);
        items.add(5);
        items.add(1);
        items.add(9);
        items.add(4);
        items.add(1);
        items.add(0);
        items.add(177);
        return items;
    }
}
