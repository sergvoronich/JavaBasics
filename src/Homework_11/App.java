package Homework_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void passwordAndLoginCheck(String login, String password, Map<String, String> authenticationData) {
        try {
            boolean a = false;
            Pattern p = Pattern.compile("[^a-zA-Z0-9]");
            Pattern p1 = Pattern.compile("[0-9]");
            Pattern p2 = Pattern.compile("[a-zA-Z]");
            Matcher m = p.matcher(password);
            Matcher m1 = p1.matcher(password);
            Matcher m2 = p2.matcher(password);
            if (m.find() || !m1.find() || !m2.find()) {
                throw new Exception("Пароль должен содержать только буквы латинского алфавита и хотя бы одну цифру");
            } else if (password.length() > 20 || password.length() < 8) {
                throw new Exception("Пароль должен содержать от 8 до 20 символов");
            } else {
                for (String key : authenticationData.keySet()) {
                    if (key.equals(login)) {
                        System.out.println("Введен неверный пароль");
                        a = true;
                    }
                }
            }
            if(!a) {
                System.out.println("Пользователя с таким именем не существует");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean authentication(Map<String, String> authenticationData) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String login = sc.nextLine();
        System.out.println("Введите пароль:");
        String password = sc.nextLine();

        if (authenticationData.containsKey(login) && authenticationData.containsValue(password)) {
            System.out.println("Аутентификация успешно выполнена!");
            System.out.println("Здравствуйте, " + login + "!");
            return true;
        } else {
            passwordAndLoginCheck(login, password, authenticationData);
            return false;
        }
    }

    public static void main(String[] args) {

        Map<String, String> authenticationData = new HashMap<>();
        authenticationData.put("Serg21", "password500");
        authenticationData.put("Ivan22", "password600");
        authenticationData.put("Liza23", "password700");
        authenticationData.put("Igor24", "password800");

        boolean res = false;
        while (!res) {
            res = authentication(authenticationData);
        }
    }
}
