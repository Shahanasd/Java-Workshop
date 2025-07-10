package com.vetias.java.workshop.basics;
import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name=scanner.next();
            System.out.println("Enter your gender");
            String gender=scanner.next();
            if("Male".equalsIgnoreCase(gender)) {
                System.out.println("Hello Mr. " + name);
            } else{
                System.out.println("Hello Ms. " + name);
            }
            System.out.println("Enter your qualification");
            String qualification=scanner.next();
            if("Male".equalsIgnoreCase(gender)){
                System.out.println("Mr. " + name + " " + qualification);
            }
            else{
                System.out.println("Ms. " + name + "  " + qualification);
            }
        }
    }
}
