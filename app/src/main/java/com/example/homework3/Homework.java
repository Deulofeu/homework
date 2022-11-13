package com.example.homework3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        taskOne();
        taskTwo();
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

    static void taskTwo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        int first = in.nextInt();
        System.out.print("Введите второе число - ");
        int second = in.nextInt();
        System.out.print("Введите третье число - ");
        int third = in.nextInt();
        int one = first >= 0 ? first : -first;
        int two = second >= 0 ? second : -second;
        int three = third >= 0 ? third : -third;
        if (one < two && one < three) {
            System.out.println("Наименьшее число по модулю - " + one);
        } else if (two < one && two < three) {
            System.out.println("Наименьшее число по модулю - " + two);
        } else if (three < one && three < two) {
            System.out.println("Наименьшее число по модулю - " + three);
        }
    }
}
