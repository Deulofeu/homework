package com.example.homework.lesson1_7;

public final class LifeSimCard extends SimCard {
    public LifeSimCard(int balance, String number) {
        super(balance, "44" + number);
    }

    @Override
    public String getOperatorName() {
        return "Life";
    }

    @Override
    public void makeCall(String number) {
        int priceMakeCall = number.startsWith("44") ? 1 : 3;
        if (getBalance() >= priceMakeCall) {
            setBalance(getBalance() - priceMakeCall);
            System.out.println("Звоню на номер: " + number);
        } else {
            System.out.println("Недостаточно средств на балансе");
        }
    }

    @Override
    public void receiveCall(String number) {
        if (number.startsWith("44")) {
            System.out.println("Принимаю звонок с номера: " + number);
        } else {
            setBalance(getBalance() - 1);
            System.out.println("Принимаю звонок с номера: " + number);
        }
    }
}