package com.example.homework3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        taskOne();
    }

    static void taskOne() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число - ");
        int a = in.nextInt();
        if ((a % 2 == 0)) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
