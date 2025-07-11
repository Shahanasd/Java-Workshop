package com.vetias.java.workshop.streams;
import java.util.Arrays;
import java.util.stream.IntStream;
public class ArrayssStream {
        public static void main(String[] args) {
        int[] marks = {90, 56, 78, 34, 45, 21, 87};
        IntStream markStream=Arrays.stream(marks);
        long numbersOfSubjectPassed = markStream.filter(mark-> mark >= 40).count();
        System.out.println("Number of subjects passed: " + numbersOfSubjectPassed);
    }
}
