package src.com.vetias.java.workshop.basics;

import java.time.LocalDate;
import java.util.Scanner;

public class Birthdate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(("Enter your date of birth in the format YYYY-MM-DD: "));
        String dob=scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(dob);
        int yearOfBirth = birthdate.getYear();
        int currentyear=LocalDate.now().getYear();
        int age = currentyear - yearOfBirth;
        System.out.println(age);
    }
}
