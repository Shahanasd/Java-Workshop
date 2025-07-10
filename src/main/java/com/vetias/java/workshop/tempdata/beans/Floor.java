package com.vetias.java.workshop.tempdata.beans;

public class Floor {
    private String name;
    private Integer number;

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setNumber(Integer aNumber) {
        number = aNumber;
    }
    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Floor)) return false;

        Floor floor = (Floor) o;

        if (name != null ? !name.equals(floor.name) : floor.name != null) return false;
        return number != null ? number.equals(floor.number) : floor.number == null;
    }
}
