import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;

public class WaterApp extends Application {

    public static void main(String[] args) {
        Application.launch(WaterApp.class, args);
    }

    @Override
    public void start(Stage stage) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.getLoginButton().setOnAction((e) -> {
            stage.setScene(setLayout("console", stage));
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
            return new Scene(new WaterSourceReportScreen());
        }
        else if (layout.equals("waterpurityreport")) {
            return new Scene(new WaterPurityReportScreen());
        } else {
            return null;
        }
    }
}
