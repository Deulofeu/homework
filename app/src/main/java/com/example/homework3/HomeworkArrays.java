package com.example.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        taskThreeArrays();
    }

    static void taskThreeArrays() {
        int n = 20;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
        }
        System.out.println(Arrays.toString(array));
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, которое хотите удалить из исходного массива: ");
        int del = in.nextInt();
        int count = 0;
        for (int needDel : array) {
            if (needDel == del) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Такого числа нет в массиве");
        } else {
            int[] newArray = new int[n - count];
            int temp = 0;
            for (int i : array) {
                if (i != del) {
                    newArray[temp] = i;
                    temp++;
                }
            }
            System.out.println("Массив без заданного числа - " + Arrays.toString(newArray));
        }
    }
}
