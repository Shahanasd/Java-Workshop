package com.vetias.java.workshop.tempdata.beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private String area;
    private LocalDateTime openTime;
    private LocalDateTime closeTime;

    public void setName(String aName) {
        name = aName;
    }  
    public String getName() {
        return name;
    }
    public void setArea(String aArea) {
        area = aArea;
    }
    public String getArea() {
        return area;
    }
    public void setOpenTime(LocalDateTime aOpenTime) {
        openTime = aOpenTime;
    }
    public LocalDateTime getOpenTime() {
        return openTime;
    }
    public void setCloseTime(LocalDateTime aCloseTime) {
        closeTime = aCloseTime;
    }
    public LocalDateTime getCloseTime() {
        return closeTime;
    }
    public void printDetails() {
       
        throw new UnsupportedOperationException("Unimplemented method 'printDetails'");
    }
}
