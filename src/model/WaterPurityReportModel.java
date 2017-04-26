package model;
import java.io.Serializable;
public class WaterPurityReportModel implements Serializable {
    public static int numReports = 0;
    private int id;
    private double lat; 
    private double longitutde;
    private String condition;
    private int virusPPM;
    private int contaminentPPM;
    public WaterPurityReportModel(double lat, double longitutde, String condition, int virusPPM, int contaminentPPM) {
        this.lat = lat;
        this.longitutde = longitutde;
        this.condition = condition;
        this.virusPPM = virusPPM;
        this.contaminentPPM = contaminentPPM;
        this.id = numReports;
        numReports++;
    }

    public int getId() { return id; }
    public double getLat() { return lat; }
    public double getLong() { return longitutde; }
    public String getCondition() { return condition; }
    public int getVirusPPM() { return virusPPM; }
    public int contaminentPPM() { return contaminentPPM; }

}
