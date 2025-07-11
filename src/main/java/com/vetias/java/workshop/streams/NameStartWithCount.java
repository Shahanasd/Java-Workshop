package com.vetias.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class NameStartWithCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Shahana");
        names.add("Madhuja");
        names.add("Vinu");
        names.add("Sweety");
        names.add("Sanjana");
        long namecount=names.stream().filter(name-> name.startsWith("S")).count();
        System.out.println("Number of names starting with 'S': " + namecount);
    }
}
