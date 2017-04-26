package util;

import model.UserModel;
import model.UserLevel;
import java.util.Map;
import java.util.HashMap;

public class AccountUtil {

    static Map<UserModel, UserModel> accounts = new HashMap<UserModel, UserModel>();

    public static boolean loginValid(UserModel user) {
        if (accounts.keySet().contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public static void add(UserModel user) {
        accounts.put(user, user);
    }
}
