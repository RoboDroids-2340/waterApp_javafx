package view;

import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ConsoleScreen extends StackPane {
    private Button waterReportButton;
    private Button waterPurityButton;
    public ConsoleScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(300);
        middle.setTranslateY(100);
        Label waterReportLabel = new Label("Welcome!");
        waterReportButton = new Button("Create New Water Source Report");
        waterPurityButton = new Button("Create New Water Purity Report");
        middle.getChildren().addAll(waterReportLabel, waterReportButton, waterPurityButton);
        getChildren().addAll(middle);
    }

    public Button getWaterReportButton() {
        return waterReportButton;
    }

    public Button getWaterPurityButton() {
        return waterPurityButton;
    }
}

