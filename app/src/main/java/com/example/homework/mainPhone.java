package com.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class mainPhone {

    public static void main(String[] args) {
        SimCard[] simCards = new SimCard[(int) (Math.random() * 10 + 1)];
        System.out.println("Список симкарт:");
        for (int i = 0; i < simCards.length; i++) {
            int randomNumberForChoosingSim = (int) (Math.random() * 3 + 1);
            switch (randomNumberForChoosingSim) {
                case 1:
                    simCards[i] = new MtsSimCard((int) (Math.random() * 10 + 1), String.valueOf((int) (Math.random() * 9999999 + 1000000)));
                    break;
                case 2:
                    simCards[i] = new A1SimCard((int) (Math.random() * 10 + 1), String.valueOf((int) (Math.random() * 9999999 + 1000000)));
                    break;
                case 3:
                    simCards[i] = new LifeSimCard((int) (Math.random() * 10 + 1), String.valueOf((int) (Math.random() * 9999999 + 1000000)));
                    break;
            }
            System.out.println("Оператор: " + simCards[i].getOperatorName() + "; Номер: " + simCards[i].getNumber() + "; Баланс: " + simCards[i].getBalance());
        }
        System.out.println();
        Phone phone = new Phone(new SimCard(0, ""));
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < simCards.length; i++) {
            if (i % 2 == 0) {
                phone.insertNewSim(simCards[i]);
                System.out.println("Введите код оператора и номер телефона на который хотите позвонить");
                String callNumber = in.nextLine();
                if (callNumber.length() != 9) {
                    System.out.println("Неправильно введен номер");
                } else {
                    phone.makeCall(callNumber);
                    phone.printBalance();
                }
            } else {
                phone.insertNewSim(simCards[i]);
                System.out.println("Введите код оператора и номер телефона с которого вам звонят");
                String receiveNumber = in.nextLine();
                if (receiveNumber.length() != 9) {
                    System.out.println("Неправильно введен номер");
                } else {
                    phone.receiveCall(receiveNumber);
                    phone.printBalance();
                }
            }
        }
    }
}

