package com.example.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        taskOne();
        taskTwo();
        taskThree();
        taskFour();
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

    static void taskThree() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для 3его задания - ");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели");
        }
    }

    static void taskFour() {
        for (int i = 0; i < 100; i += 5) {
            if (i == 0) continue;
            System.out.print(i + " ");
        }
    }
}

