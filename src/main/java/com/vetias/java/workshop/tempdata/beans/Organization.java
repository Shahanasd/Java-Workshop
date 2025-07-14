package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDate;

public record Organization(String name,
                          String completeAddress,
                          String website,
                          String email,
                          String phoneNumber,
                          Long regNum,
                          LocalDate registrationDate){

}
    // No additional methods or fields needed for a record

    
