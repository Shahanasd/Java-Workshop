package src.com.vetias.java.workshop.tempdata.beans;

public class Hostel extends Building{
     private boolean isMessAvailable;
     private int numberOfRooms;
     
     public boolean isMessAvailable() {
         return isMessAvailable;
     }
     public void setMessAvailable(boolean isMessAvailable) {
         this.isMessAvailable = isMessAvailable;
     }
     public int getNumberOfRooms() {
         return numberOfRooms;
     }
     public void setNumberOfRooms(int numberOfRooms) {
         this.numberOfRooms = numberOfRooms;
     }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Hostel Details:");
        System.out.println("Mess Available: " + isMessAvailable);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
    @Override
    public String toString() {
        return "Hostel{" +
                "isMessAvailable=" + isMessAvailable +
                ", numberOfRooms=" + numberOfRooms +
                "} " + super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hostel)) return false;
        if (!super.equals(o)) return false;

        Hostel hostel = (Hostel) o;

        if (isMessAvailable != hostel.isMessAvailable) return false;
        return numberOfRooms == hostel.numberOfRooms;
    }
}