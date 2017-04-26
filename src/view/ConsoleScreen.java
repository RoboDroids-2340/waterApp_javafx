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
    private Button viewSourceReportButton;
    private Button viewPurityReportButton;
    public ConsoleScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(300);
        middle.setTranslateY(100);
        Label waterReportLabel = new Label("Welcome!");
        editProfileButton = new Button("Edit Profile");
        waterReportButton = new Button("Create New Water Source Report");
        waterPurityButton = new Button("Create New Water Purity Report");
        viewPurityReportButton = new Button("View Purity Reports");
        viewSourceReportButton = new Button("View Source Reports");
        logoutButton = new Button("Logout");
        middle.getChildren().addAll(waterReportLabel, editProfileButton, waterReportButton, waterPurityButton, 
                viewPurityReportButton, viewSourceReportButton, logoutButton);
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
    
    public Button getViewSourceButton() {
        return viewSourceReportButton;
    }

    public Button getViewPurityButton() {
        return viewPurityReportButton;
    }
}

