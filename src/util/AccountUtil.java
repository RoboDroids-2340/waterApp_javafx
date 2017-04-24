package util;

import model.UserModel;
import model.UserLevel;
import java.util.Map;
import java.util.HashMap;

public class AccountUtil {

    public static boolean loginValid(UserModel user) {
        Map<UserModel, UserModel> valid = new HashMap<UserModel, UserModel>();
        valid.put(new UserModel("username", "password"), new UserModel("username", "password",  UserLevel.ADMIN));
        if (valid.keySet().contains(user)) {
            return true;
        } else {
            return false;
        }
    }
}
