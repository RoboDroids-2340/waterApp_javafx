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
    private Button logoutButton;
    private Button editProfileButton;
    public ConsoleScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(300);
        middle.setTranslateY(100);
        Label waterReportLabel = new Label("Welcome!");
        editProfileButton = new Button("Edit Profile");
        waterReportButton = new Button("Create New Water Source Report");
        waterPurityButton = new Button("Create New Water Purity Report");
        logoutButton = new Button("Logout");
        middle.getChildren().addAll(editProfileButton, waterReportLabel, waterReportButton, waterPurityButton, Logout);
        getChildren().addAll(middle);
    }

    public Button getWaterReportButton() {
        return waterReportButton;
    }

    public Button getWaterPurityButton() {
        return waterPurityButton;
    }

    public Button getEditProfileButton() {
        return editProfileButton;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }
}

