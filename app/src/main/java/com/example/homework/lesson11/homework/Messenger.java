package com.example.homework.lesson11.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Messenger {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<User> users = new ArrayList<>();
    private static final int ADD_USER = 1;
    private static final int PRINT_USERS = 2;
    private static final int WRITE_MESSAGE = 3;
    private static final int READ_MESSAGE = 4;
    private static final int EXIT = 5;

    public static void main(String[] args) {
        int numberOfOperation;
        do {
            System.out.println("1 - добавить нового пользователя");
            System.out.println("2 - вывести список пользователей");
            System.out.println("3 - написать сообщение пользователю");
            System.out.println("4 - просмотреть сообщения пользователя");
            System.out.println("5 - закончить работу");
            numberOfOperation = Integer.parseInt(in.nextLine());
            switch (numberOfOperation) {
                case ADD_USER: {
                    addUser();
                    break;
                }
                case PRINT_USERS: {
                    printUsers();
                    break;
                }
                case WRITE_MESSAGE: {
                    writeMessage();
                    break;
                }
                case READ_MESSAGE: {
                    readMessage();
                    break;
                }
                case EXIT: {
                    System.out.println("Конец работы");
                    break;
                }
            }
        } while (numberOfOperation != 5);
    }

    private static void addUser() {
        System.out.println("Введите имя");
        String userName = in.nextLine();
        User user = new User(userName);
        users.add(user);
    }

    public static void printUsers() {
        if (users.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        System.out.println("Список пользователей");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + ")" + users.get(i).getUserName());
        }
    }

    public static void writeMessage() {
        printUsers();
        int indexOfUser;
        while (true) {
            System.out.println("Индекс пользователя, кому написать сообщение");
            indexOfUser = Integer.parseInt(in.nextLine());
            if (indexOfUser > users.size() || indexOfUser < 0) {
                System.out.println("Неверный индекс, попробуйте еще");
                continue;
            } else {
                System.out.println("Напишите сообщение, которое хотите отправить этому пользователю");
                String textOfMessage = in.nextLine();
                users.get(indexOfUser).writeMessage(textOfMessage);
                break;
            }
        }
    }

    public static void readMessage() {
        printUsers();
        int indexOfUser;
        while (true) {
            System.out.println("Индекс пользователя, у кого прочитать сообщение");
            indexOfUser = Integer.parseInt(in.nextLine());
            if (indexOfUser > users.size() || indexOfUser < 0) {
                System.out.println("Неверный индекс, попробуйте еще");
                continue;
            } else {
                users.get(indexOfUser).readMessage();
                break;
            }
        }
    }
}
