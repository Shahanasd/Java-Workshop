package src.com.vetias.java.workshop.tempdata.beans;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private String postalCode;

    public void setName(String aName){
        name=aName;
    }

    public String getName(){
        return name;
    }   
    public void setLatitude(Double aLatitude){
        latitude=aLatitude;
    }
    public Double getLatitude(){
        return latitude;
    }
    public void setLongitude(Double aLongitude){
        longitude=aLongitude;
    }
    public Double getLongitude(){
        return longitude;
    }
    public void setDescription(String aDescription){
        description=aDescription;
    }
    public String getDescription(){
        return description;
    }
    public void setCountry(String aCountry){
        country=aCountry;
    }
    public String getCountry(){
        return country;
    }
    public void setCity(String aCity){
        city=aCity;
    }
    public String getCity(){
        return city;
    }
    public void setAddress(String aAddress){
        address=aAddress;
    }
    public String getAddress(){
        return address;
    }
    public void setPostalCode(String aPostalCode){
        postalCode=aPostalCode;
    }
    public String getPostalCode(){
        return postalCode;
    }
}