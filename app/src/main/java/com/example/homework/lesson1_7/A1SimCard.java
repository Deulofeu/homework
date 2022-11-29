package com.example.homework.lesson1_7;

public final class A1SimCard extends SimCard {
    public A1SimCard(int balance, String number) {
        super(balance, "33" + number);
    }

    @Override
    public String getOperatorName() {
        return "A1";
    }

    @Override
    public void makeCall(String number) {
        int priceMakeCall = number.startsWith("33") ? 1 : 3;
        if (getBalance() >= priceMakeCall) {
            setBalance(getBalance() - priceMakeCall);
            System.out.println("Звоню на номер: " + number);
        } else {
            System.out.println("Недостаточно средств на балансе");
        }
    }

    @Override
    public void receiveCall(String number) {
        if (number.startsWith("33")) {
            System.out.println("Принимаю звонок с номера: " + number);
        } else {
            setBalance(getBalance() - 1);
            System.out.println("Принимаю звонок с номера: " + number);
        }
    }
}
