package com.vetias.java.workshop.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MarksSorted {
    public static void main(String[] args) {
        List<Integer> marks=Arrays.asList(90, 85, 70, 95, 80, 60, 75);
        List<Integer> sortedMarks = marks.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println("Sorted Marks: " + sortedMarks);
        List<Integer> reverseDec=marks.stream().sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Reverse Sorted Marks: " + reverseDec);
        System.out.println("Hghest Mark:"+reverseDec.get(0));
    }

   
}