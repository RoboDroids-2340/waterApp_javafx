package view;

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

public class WaterSourceReportScreen extends StackPane {
    private Button submit;
    private ListView<String> typeView;
    private ListView<String> conditionView;
    public WaterSourceReportScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(900);
        middle.setTranslateY(100);
        Label titleLabel = new Label("Water Source Report");
        TextField waterLat = new TextField("Latitude");
        TextField waterLong = new TextField("Longitude");
        ObservableList<String> type = FXCollections.observableArrayList(
            "Bottled", "Well", "Stream", "Lake", "Spring", "Other");
        typeView = new ListView<String>(type);
        typeView.setMaxWidth(300);
        typeView.setMaxHeight(150);
        ObservableList<String> condition = FXCollections.observableArrayList(
            "Waste", "Treatable-Clear", "Treatable-Clear", "Treatable-Muddy", "Potable");
        conditionView = new ListView<String>(condition);
        conditionView.setMaxWidth(300);
        conditionView.setMaxHeight(130);


        submit = new Button("submit report");
        middle.getChildren().addAll(titleLabel, waterLat, waterLong, conditionView, typeView, submit);
        getChildren().addAll(middle);
        
    }

    public Button getSubmitButton() {
        return submit;
    }

}
