package util;

import java.util.Set;
import java.util.HashSet;

import model.WaterPurityReportModel;
import model.WaterSourceReportModel;

public class ReportWriter {

    //I'm a bad person
    public static Set<WaterPurityReportModel> purityReports = new HashSet<WaterPurityReportModel>();
    public static Set<WaterSourceReportModel> sourceReports = new HashSet<WaterSourceReportModel>();

}
