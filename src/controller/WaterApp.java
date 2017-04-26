package controller;

import view.*;
import util.*;
import model.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class WaterApp extends Application {

    public static void main(String[] args) {
        Application.launch(WaterApp.class, args);
    }

    @Override
    public void start(Stage stage) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.getLoginButton().setOnAction((e) -> {
            TextInputDialog userinput = new TextInputDialog("Username");
            userinput.setTitle("username");
            userinput.setContentText("Enter Username: ");
            Optional<String> username = userinput.showAndWait();
            TextInputDialog passinput = new TextInputDialog("Password");
            passinput.setTitle("Password");
            passinput.setContentText("Enter Password: ");
            Optional<String> password = passinput.showAndWait();
            if (password.isPresent() && username.isPresent()) {
                if (AccountUtil.loginValid(new UserModel(username.get(), password.get()))) {
                    stage.setScene(setLayout("console", stage));
                }
            }
        });
        stage.setScene(new Scene(loginScreen));
        stage.show(); 
    }

    public Scene setLayout(String layout, Stage stage) {
        if (layout.equals("console")) {
            ConsoleScreen console = new ConsoleScreen();
            console.getWaterReportButton().setOnAction((e) -> {
                stage.setScene(setLayout("waterreport", stage));
            }); 
            console.getWaterPurityButton().setOnAction((e) -> {
                stage.setScene(setLayout("waterpurityreport", stage));
            });
            return new Scene(console);
        }
        else if (layout.equals("waterreport")) {
            WaterSourceReportScreen source= new WaterSourceReportScreen();
            source.getBackButton().setOnAction((e) -> {
                stage.setScene(setLayout("console", stage));
            });
            return new Scene(source);
        }
        else if (layout.equals("waterpurityreport")) {
            WaterPurityReportScreen purity = new WaterPurityReportScreen();
            purity.getBackButton().setOnAction((e) -> {
                stage.setScene(setLayout("console", stage));
            });
            purity.getSubmitButton().setOnAction((e) -> {
                WaterPurityReportModel report = purity.getReport();
                System.out.println(report.getId());
                //ReportWriter.write(report);
                stage.setScene(setLayout("console", stage));
            });
            return new Scene(purity);
        } else {
            return null;
        }
    }
}
