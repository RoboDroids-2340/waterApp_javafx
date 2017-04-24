package view;

import javafx.scene.layout.StackPane;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.util.HashMap;
import java.util.Map;
import model.UserModel;
import model.UserLevel;

public class LoginScreen extends StackPane {
    private Button loginButton;
    private Button registerButton;
    public LoginScreen() {
        VBox bottom = new VBox();
        bottom.setAlignment(Pos.BOTTOM_CENTER);
        bottom.setMaxHeight(300);
        bottom.setTranslateY(100);
        Label loginLabel = new Label("login or register");
        loginButton = new Button("Login");
        registerButton = new Button("Register");    
        bottom.getChildren().addAll(loginLabel, loginButton, registerButton);
        getChildren().addAll(bottom);
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public Button getRegisterButton() {
        return registerButton;
    }

}
