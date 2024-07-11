/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1041.com.service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tom
 */
public class UserDAO {

    private static Map<String, String> users = new HashMap<>();
    private static Map<String, String> roles = new HashMap<>();
    private static Map<String, String> fullNames = new HashMap<>();

    static {
        users.put("abc", "123");
        users.put("vutrungdung", "123456");
        users.put("admin", "1234");
        users.put("ad", "123");

        roles.put("abc", "user");
        roles.put("vutrungdung", "user");
        roles.put("admin", "admin");
        roles.put("ad", "admin");

        fullNames.put("admin", "Vũ Trung Dũng");
        fullNames.put("abc", "Lê Minh Quang");

    }

    public static boolean checkLogin(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public static String getUserRole(String username) {
        return roles.get(username);
    }

    public static String getUserFullName(String username) {
        return fullNames.get(username);
    }
}
