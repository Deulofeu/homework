package com.example.homework.lesson9.homework;

import java.util.Scanner;

public class Test {
    public static String INPUT_CHECK = "[A-Za-z\\d_]{1,20}";

    private static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(INPUT_CHECK)) {
            throw new WrongLoginException("Неверный логин");
        } else if (!password.matches(INPUT_CHECK) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        } else {
            return true;
        }
    }

    public static void registration() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин ");
        String login = in.nextLine();
        System.out.println("Введите пароль ");
        String password = in.nextLine();
        System.out.println("Подтвердите пароль ");
        String confirmPassword = in.nextLine();
        try {
            if (checkLoginAndPassword(login, password, confirmPassword))
                System.out.println("OK");
        } catch (WrongLoginException e1) {
            System.out.println(e1.getMessage());
        } catch (WrongPasswordException e2) {
            System.out.println(e2.getMessage());
        }
    }

    public static void main(String[] args) {
        registration();
    }
}
