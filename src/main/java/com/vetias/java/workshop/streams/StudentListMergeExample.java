package com.vetias.java.workshop.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentListMergeExample {
    public static void main(String[] args) {
        List<Integer> csrollno=Arrays.asList(101, 102, 103, 104);
        List<Integer> itrollno=Arrays.asList(201, 202, 203, 204);
        List<Integer>allrollno=Stream.concat(csrollno.stream(), itrollno.stream()).sorted().toList();
        System.out.println("Merged and sorted roll numbers: " + allrollno);
    }
}
