package com.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        taskOneArrays();
        taskTwoArray();
        taskThreeArrays();
    }

    static void taskOneArrays() {
        String[] names = new String[]{"Masha", "Ivan", "Igor", "Alexei"};
        Arrays.sort(names);
        System.out.println("Отсортированный массив имен - " + Arrays.toString(names));
    }

    static void taskTwoArray() {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        int evenNumbers = 0;
        while (flag) {
            System.out.print("Введите размер массива для 2ого задания - ");
            int size = in.nextInt();
            if (size <= 5) {
                System.out.println("число должно быть больше 5, повторите ввод");
            } else if (size > 10) {
                System.out.println("число должно быть не больше 10, повторите ввод");
            } else {
                int[] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    array[i] = ((int) (Math.random() * 100));
                    if (array[i] % 2 == 0) {
                        evenNumbers++;
                    }
                }
                flag = false;
                System.out.println(Arrays.toString(array));

                int[] arrayEven = new int[evenNumbers];
                if (evenNumbers == 0) {
                    System.out.println("В исходном массиве нет четных чисел");
                } else {
                    int temp = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            arrayEven[temp] = array[i];
                            temp++;
                        }
                    }
                    System.out.println("Массив четных чисел из исходного - " + Arrays.toString(arrayEven));
                }
            }
        }
    }

    static void taskThreeArrays() {
        int size = 20;
        int[] array = new int[size];
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
            int[] newArray = new int[size - count];
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
