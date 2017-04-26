package model;
import java.io.Serializable;
public class WaterPurityReportModel implements Serializable {
    public static int numReports = 0;
    private int id;
    private double lat; 
    private double longitude;
    private String condition;
    private int virusPPM;
    private int contaminentPPM;
    public WaterPurityReportModel(double lat, double longitude, String condition, int virusPPM, int contaminentPPM) {
        this.lat = lat;
        this.longitude = longitude;
        this.condition = condition;
        this.virusPPM = virusPPM;
        this.contaminentPPM = contaminentPPM;
        this.id = numReports;
        numReports++;
    }

    public int getId() { return id; }
    public double getLat() { return lat; }
    public double getLong() { return longitude; }
    public String getCondition() { return condition; }
    public int getVirusPPM() { return virusPPM; }
    public int contaminentPPM() { return contaminentPPM; }

    @Override
    public int hashCode() { return id; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof WaterPurityReportModel && ((WaterPurityReportModel) o).getId() == id) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Report id: %d%n Latitude: %f, Longitude: %f%n Condition: %s%n"
            + " Virus PPM: %d, Contaminent PPM:%d", id, lat, longitude, condition, virusPPM, contaminentPPM);
    }

}
