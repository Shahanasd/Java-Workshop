package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Shahana");
        names.add("Madhuja");
        names.add("Vinu");
        
        System.out.println(names);
        names.set(2, "ajeeee");
        for(int i=0;i<names.size();i++){
            System.out.println("Name : "+names.get(i));
        }
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted names: " + names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorted names: " + names);
        
    }
}
