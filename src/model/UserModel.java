package model;

import java.io.Serializable;
import model.UserLevel;

public class UserModel implements Serializable {
    private String username;
    private String password;
    private UserLevel level;
    public UserModel(String username, String password, UserLevel level) {
        this.username = username;
        this.password = password;
        this.level = level;
    }

    public UserModel (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }

    public UserLevel getUserLevel() { return level; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   

    @Override
    public boolean equals(Object o) {
        if (o instanceof UserModel) {
            return ((UserModel) o).getPassword().equals(password) && ((UserModel) o).getUsername().equals(username);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return username.hashCode() + password.hashCode();
    }
}
