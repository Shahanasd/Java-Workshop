package com.vetias.java.workshop.basics;
import java.time.LocalDate;
import java.util.Scanner;

public class Datetime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your year of birth: ");
            int yearofbirth = scanner.nextInt();
            int currentyear = LocalDate.now().getYear();
            int age = currentyear - yearofbirth;
            System.out.println(age);
        }
    }
}
