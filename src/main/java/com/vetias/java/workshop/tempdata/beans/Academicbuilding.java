package com.vetias.java.workshop.tempdata.beans;

public class Academicbuilding extends Building {
    private boolean isLibraryAvailable;
    private boolean isAuditoriumAvailable;

    public boolean isLibraryAvailable() {
        return isLibraryAvailable;
    }
    public void setLibraryAvailable(boolean isLibraryAvailable) {
        this.isLibraryAvailable = isLibraryAvailable;
    }  
    public boolean isAuditoriumAvailable(){
        return isAuditoriumAvailable;
    }
    public void setAuditoriumAvailable(boolean isAuditoriumAvailable){
        this.isAuditoriumAvailable = isAuditoriumAvailable;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Academic Building Details:");
        System.out.println("Library Available: " + isLibraryAvailable);
        System.out.println("Auditorium Available: " + isAuditoriumAvailable);
    }

    @Override
    public String toString() {
        return "Academicbuilding{" +
                "isLibraryAvailable=" + isLibraryAvailable +
                ", isAuditoriumAvailable=" + isAuditoriumAvailable +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Academicbuilding)) return false;
        if (!super.equals(o)) return false;

        Academicbuilding that = (Academicbuilding) o;

        if (isLibraryAvailable != that.isLibraryAvailable) return false;
        return isAuditoriumAvailable == that.isAuditoriumAvailable;
    }
}
