package com.vetias.java.workshop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSplitExample {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(12, 3, 5, 8, 10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>>groupedMap = numbers.stream().collect(Collectors.partitioningBy(no-> no%2==0));
        System.out.println("Even Numbers: " + groupedMap.get(true));
        System.out.println("Odd Numbers: " + groupedMap.get(false));
    }
}
