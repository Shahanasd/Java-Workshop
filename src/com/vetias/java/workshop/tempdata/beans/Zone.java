package src.com.vetias.java.workshop.tempdata.beans;

public class Zone {
    private String name;
    private String zoneId;
    private String Type;
    private String area;

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setZoneId(String aZoneId) {
        zoneId = aZoneId;
    }
    public String getZoneId() {
        return zoneId;
    }
    public void setType(String aType) {
        Type = aType;
    }
    public String getType() {
        return Type;
    }
    public void setArea(String aArea) {
        area = aArea;
    }
    public String getArea() {
        return area;
    }
}