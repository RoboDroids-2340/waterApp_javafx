package view;

import model.WaterPurityReportModel;

import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class WaterPurityReportScreen extends StackPane {
    private Button submit;
    private Button back;
    private TextField waterLat;
    private TextField waterLong;
    private TextField virusPPM;
    private TextField contaminentPPM;
    private ListView<String> conditionView;
    public WaterPurityReportScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(900);
        middle.setTranslateY(100);
        Label titleLabel = new Label("Water Purity Report");
        waterLat = new TextField("Latitude");
        waterLong = new TextField("Longitude");
        ObservableList<String> condition = FXCollections.observableArrayList(
            "Safe", "Treatable", "Unsafe");
        conditionView = new ListView<String>(condition);
        conditionView.setMaxWidth(300);
        conditionView.setMaxHeight(100);
        virusPPM = new TextField("Virus PPM");
        contaminentPPM = new TextField("Contaminent PPM");
        submit = new Button("submit report");
        back = new Button("back");
        middle.getChildren().addAll(titleLabel, waterLat, waterLong, conditionView, virusPPM, contaminentPPM, submit, back);
        getChildren().addAll(middle);
        
    }

    public Button getSubmitButton() {
        return submit;
    }

    public Button getBackButton() {
        return back;
    }

    public WaterPurityReportModel getReport() {
        double lat = Double.parseDouble(waterLat.getCharacters().toString());
        double lon = Double.parseDouble(waterLong.getCharacters().toString());
        String condition = conditionView.getSelectionModel().getSelectedItem();
        int virusPPMVal = Integer.parseInt(virusPPM.getCharacters().toString());
        int contaminentPPMVal = Integer.parseInt(virusPPM.getCharacters().toString());
        return new WaterPurityReportModel(lat, lon, condition, virusPPMVal, contaminentPPMVal);
    }

}
