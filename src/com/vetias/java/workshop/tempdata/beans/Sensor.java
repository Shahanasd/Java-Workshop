package src.com.vetias.java.workshop.tempdata.beans;

public class Sensor {
    private String censorId;
    private String name;
    private Integer TemperatureData;

    public void setCensorId(String aCensorId) {
        censorId = aCensorId;
    }
    public String getCensorId() {
        return censorId;
    }
    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setTemperatureData(Integer aTemperatureData) {
        TemperatureData = aTemperatureData;
    }
    public Integer getTemperatureData() {
        return TemperatureData;
    }
}
