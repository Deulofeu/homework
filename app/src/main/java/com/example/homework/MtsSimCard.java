package com.example.homework;

public final class MtsSimCard extends SimCard {
    public MtsSimCard(int balance, String number) {
        super(balance, "29" + number);
    }

    @Override
    public String getOperatorName() {
        return "Mts";
    }

    @Override
    public void makeCall(String number) {
        int priceMakeCall = number.startsWith("29") ? 1 : 3;
        if (getBalance() >= priceMakeCall) {
            setBalance(getBalance() - priceMakeCall);
            System.out.println("Звоню на номер: " + number);
        } else {
            System.out.println("Недостаточно средств на балансе");
        }
    }

    @Override
    public void receiveCall(String number) {
        if (number.startsWith("29")) {
            System.out.println("Принимаю звонок с номера: " + number);
        } else {
            setBalance(getBalance() - 1);
            System.out.println("Принимаю звонок с номера: " + number);
        }
    }
}
