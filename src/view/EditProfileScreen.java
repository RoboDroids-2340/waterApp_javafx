package view;

import util.AccountUtil;
import model.UserModel;
import model.UserLevel;

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

public class EditProfileScreen extends StackPane {
    private Button submit;
    private Button back;
    private TextField usernameField;
    private TextField passwordField;
    private TextField newPasswordField;
    public EditProfileScreen() {
        VBox middle = new VBox();
        middle.setAlignment(Pos.CENTER);
        middle.setMaxHeight(900);
        middle.setTranslateY(100);
        Label titleLabel = new Label("Edit Profile");
        usernameField = new TextField("Username");
        passwordField = new TextField("current password");
        newPasswordField = new TextField("new password");
        submit = new Button("submit");
        back = new Button("back");
        middle.getChildren().addAll(titleLabel, usernameField, passwordField, newPasswordField, submit, back);
        getChildren().addAll(middle);
        
    }

    public Button getSubmitButton() {
        return submit;
    }

    public Button getBackButton() {
        return back;
    }

    public void update() {
        try {
            UserModel curr = new UserModel(usernameField.getCharacters().toString(), passwordField.getCharacters().toString());
            UserModel fromMap = AccountUtil.accounts.remove(curr);
            fromMap.setPassword(newPasswordField.getCharacters().toString());
            AccountUtil.add(fromMap);
        } catch (Exception e) {}
    }

}
