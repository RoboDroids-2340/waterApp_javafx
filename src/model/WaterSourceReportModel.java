package model;
import java.io.Serializable;
public class WaterSourceReportModel implements Serializable {
    public static int numReports = 0;
    private int id;
    private double lat; 
    private double longitude;
    private String condition;
    private String type;
    public WaterSourceReportModel(double lat, double longitude, String condition, String type) {
        this.lat = lat;
        this.longitude = longitude;
        this.condition = condition;
        this.type = type;
        this.id = numReports;
        numReports++;
    }

    public int getId() { return id; }
    public double getLat() { return lat; }
    public double getLong() { return longitude; }
    public String getCondition() { return condition; }
    public String getType() { return type; }

    @Override
    public int hashCode() { return id; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof WaterSourceReportModel && ((WaterSourceReportModel) o).getId() == id) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Report id: %d%n Latitude: %d, Longitude: %d%n Condition: %s%n"
            + " type:%s%n", id, lat, longitude, condition, type);
    }


}
