package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MarkList {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);
        System.out.println("Marks: " + marks);
        marks.sort(Comparator.naturalOrder());
        System.out.println("Sorted Marks: " + marks);
        marks.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted Marks: " + marks);
        System.out.println("Highest Mark: " + marks.get(0));
    }
}
