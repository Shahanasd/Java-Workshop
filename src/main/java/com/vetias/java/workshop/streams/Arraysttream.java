package com.vetias.java.workshop.streams;

import java.util.Arrays;

public class Arraysttream {
    public static void main(String[] args) {
        int[] marks={90,56,78,34,45,21,87};
        long numbersOfSubjectPassed=Arrays.stream(marks).filter(mark->mark>=40).count();
        System.out.println("Number of subjects passed: " + numbersOfSubjectPassed);
    }
}
