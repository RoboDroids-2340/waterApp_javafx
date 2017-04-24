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

public class WaterPurityReportScreen extends StackPane {
    private Button submit;
    private ListView<String> conditionView;
    public WaterPurityReportScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(900);
        middle.setTranslateY(100);
        Label titleLabel = new Label("Water Purity Report");
        TextField waterLat = new TextField("Latitude");
        TextField waterLong = new TextField("Longitude");
        ObservableList<String> condition = FXCollections.observableArrayList(
            "Safe", "Treatable", "Unsafe");
        conditionView = new ListView<String>(condition);
        conditionView.setMaxWidth(300);
        conditionView.setMaxHeight(100);
        TextField virusPPM = new TextField("Virus PPM");
        TextField contaminentPPM = new TextField("Contaminent PPM");
        submit = new Button("submit report");
        middle.getChildren().addAll(titleLabel, waterLat, waterLong, conditionView, virusPPM, contaminentPPM, submit);
        getChildren().addAll(middle);
        
    }

    public Button getSubmitButton() {
        return submit;
    }

}
