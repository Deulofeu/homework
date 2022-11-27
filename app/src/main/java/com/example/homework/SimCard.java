package com.example.homework;

public class SimCard {
    private int balance;
    private String number;

    protected SimCard(int balance, String number) {
        this.balance = balance;
        this.number = number;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOperatorName() {
        return null;
    }

    public void makeCall(String number) {
        System.out.println("Звоню на номер: " + number);
    }

    public void receiveCall(String number) {
        System.out.println("Принимаю звонок с номера: " + number);
    }
}
