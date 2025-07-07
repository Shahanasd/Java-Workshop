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
    @Override
    public String toString() {
        return "Zone{" +
                "name='" + name + '\'' +
                ", zoneId='" + zoneId + '\'' +
                ", Type='" + Type + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zone)) return false;

        Zone zone = (Zone) o;

        if (!name.equals(zone.name)) return false;
        if (!zoneId.equals(zone.zoneId)) return false;
        if (!Type.equals(zone.Type)) return false;
        return area.equals(zone.area);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + zoneId.hashCode();
        result = 31 * result + Type.hashCode();
        result = 31 * result + area.hashCode();
        return result;
    }
}
