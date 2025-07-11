package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Shahana");
        names.add("Madhuja");
        names.add("Vinu");
        names.add("Sweety");
        names.add("Sanjana");
        names.add("Shahana");
        names.stream().filter(name-> name.startsWith("S")||name.startsWith("s")).distinct()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
