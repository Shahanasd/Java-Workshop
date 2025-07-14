package com.vetias.java.workshop.tempdata.beans;
import java.time.LocalDate;

public class TemperatureDataApplication {
    public static void main(String[] args) {
        // Example usage of Organization record
        Organization vet=new Organization("Vetias",
                                          "Thindal",
                                          "www.vetias.com",
                                          "vetias@gmail.com",
                                          "1234567890",
                                          123456789L,
                                          LocalDate.of(2020, 1, 1));
        System.out.println(vet.name());
        System.out.println(vet.completeAddress());
        System.out.println(vet.website());
        System.out.println(vet.email());
        System.out.println(vet.phoneNumber());
        System.out.println(vet.regNum());
        System.out.println(vet.registrationDate());
    }
}