package com.example.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        taskOneArrays();
        taskTwoArray();
    }

    static void taskOneArrays() {
        String[] names = new String[]{"Nikita", "Ivan", "Igor", "Alexei"};
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
}
