package util;

import model.UserModel;
import model.UserLevel;
import java.util.Map;
import java.util.HashMap;

public class AccountUtil {

    public static Map<UserModel, UserModel> accounts = new HashMap<UserModel, UserModel>();

    public static boolean loginValid(UserModel user) {
        return accounts.keySet().contains(user);
    }

    public static void add(UserModel user) {
        accounts.put(user, user);
    }
    
}
