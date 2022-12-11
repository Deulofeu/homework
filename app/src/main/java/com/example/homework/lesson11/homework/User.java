package com.example.homework.lesson11.homework;

import java.util.ArrayDeque;

public class User {
    private String userName;
    private ArrayDeque<String> messages = new ArrayDeque<>();


    User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayDeque<String> getMessages() {
        return messages;
    }

    public void writeMessage(String someText) {
        messages.add(someText);
    }

    public void readMessage() {
        while (messages.peek() != null) {
            System.out.println(messages.poll());
        }
    }
}

