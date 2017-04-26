package view;

import model.WaterPurityReportModel;
import util.ReportWriter;

import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class WaterPurityViewScreen extends StackPane {
    private Button back;
    private ListView<String> conditionView;
    public WaterPurityViewScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(800);
        middle.setTranslateY(100);
        Label titleLabel = new Label("Water Purity Reports");
        ObservableList<String> condition = FXCollections.observableArrayList();
        for (WaterPurityReportModel model : ReportWriter.purityReports) {
            condition.add(model.toString()); 
        }
        conditionView = new ListView<String>(condition);
        conditionView.setMaxWidth(400);
        conditionView.setMaxHeight(300);
        back = new Button("back");
        middle.getChildren().addAll(titleLabel, conditionView, back);
        getChildren().addAll(middle);
        
    }

    public Button getBackButton() {
        return back;
    }

}
