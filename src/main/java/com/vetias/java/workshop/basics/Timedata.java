package com.vetias.java.workshop.basics;

import java.time.LocalTime;

public class Timedata {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationTime=LocalTime.of(18, 59,59);
        int hoursleft= registrationTime.getHour() - currentTime.getHour();
        int minutesleft=registrationTime.getMinute()-currentTime.getMinute();
        int secondsleft=registrationTime.getSecond()-currentTime.getSecond();
        System.out.println("You have "+hoursleft+" hours, "+minutesleft+" minutes, and "+secondsleft+" seconds left to register.");
    }
}
