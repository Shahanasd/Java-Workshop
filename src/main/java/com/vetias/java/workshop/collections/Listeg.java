package com.vetias.java.workshop.collections;
import java.util.ArrayList;

import java.util.List;

public class Listeg {
    




    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Shahana");
        names.add("Madhuja");
        names.add("Vinu");
        names.forEach(System.out::println);
    }
}
