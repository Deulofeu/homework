package com.example.homework;

import java.util.Scanner;

public class CreditCard {
    String accountNumber;
    int amount;

    public CreditCard(String accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void infoAboutCard() {
        System.out.println("Номер счета: " + accountNumber + "\n" + "сумма на счете: " + amount + " BYN");
    }

    int addBalance(int sum) {
        amount += sum;
        return amount;
    }

    int removeFromBalance(int sum) {
        if (sum > amount) {
            System.out.println("Недостаточно денег на балансе");
            return amount;
        } else {
            amount -= sum;
            return amount;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumAdd, sumRemove;
        CreditCard card1 = new CreditCard("BY20OLMP31350000001000000933", 0);
        CreditCard card2 = new CreditCard("BY86AKBB10100000002966000000", 10);
        CreditCard card3 = new CreditCard("BY13NBRB36009000347600002200", 20);
        card1.infoAboutCard();
        card2.infoAboutCard();
        card3.infoAboutCard();
        System.out.print("Введите сумму для пополнения баланса первой карты: ");
        sumAdd = in.nextInt();
        card1.addBalance(sumAdd);
        System.out.print("Введите сумму для пополнения баланса второй карты: ");
        sumAdd = in.nextInt();
        card2.addBalance(sumAdd);
        System.out.print("Введите сумму для списания баланса с третьей карты: ");
        sumRemove = in.nextInt();
        card3.removeFromBalance(sumRemove);
        card1.infoAboutCard();
        card2.infoAboutCard();
        card3.infoAboutCard();
    }
}
