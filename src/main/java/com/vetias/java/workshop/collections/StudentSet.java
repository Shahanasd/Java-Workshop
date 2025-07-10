package com.vetias.java.workshop.collections;

import java.util.Set;
import java.util.HashSet;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> studentIds = new HashSet<>();
        studentIds.add(101);
        studentIds.add(105);
        studentIds.add(107);
        studentIds.add(103);
        studentIds.add(102);
        System.out.println("Student IDs: " + studentIds);
    }
}
