package com.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkNArrays {
    public static void main(String[] args) {
        taskOneNArrays();
        taskTwoNArrays();
        taskThreeNArrays();
    }

    static void taskOneNArrays() {
        Scanner in = new Scanner(System.in);
        int size1, size2;
        System.out.println("\n" + "Задание 1" + "\n");
        System.out.print("Число строк для двумерного массива: ");
        size1 = in.nextInt();
        System.out.print("Число столбцов для двумерного массива: ");
        size2 = in.nextInt();
        int[][] twoArray = new int[size1][size2];
        int newSize = size1 * size2;
        int[] oneArray = new int[newSize];
        int temp = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = ((int) (Math.random() * 100));
                oneArray[temp] = twoArray[i][j];
                temp++;
            }
        }
        System.out.println("Двумерный массив: " + "\n" + Arrays.deepToString(twoArray));
        System.out.println("Одномерный массив из двумерного: " + Arrays.toString(oneArray));
    }

    static void taskTwoNArrays() {
        Scanner in = new Scanner(System.in);
        int size1, size2, size3;
        System.out.println("\n" + "Задание 2" + "\n");
        System.out.print("Введите первую размерность трехмерного массива - ");
        size1 = in.nextInt();
        System.out.print("Введите вторую размерность трехмерного массива - ");
        size2 = in.nextInt();
        System.out.print("Введите третью размерность трехмерного массива - ");
        size3 = in.nextInt();
        int[][][] threeArray = new int[size1][size2][size3];
        String[][][] strThreeArray = new String[size1][size2][size3];

        for (int i = 0; i < threeArray.length; i++) {
            for (int j = 0; j < threeArray[i].length; j++) {
                for (int k = 0; k < threeArray[i][j].length; k++) {
                    threeArray[i][j][k] = ((int) (Math.random() * 10 + 1));
                    switch (threeArray[i][j][k]) {
                        case 1:
                            strThreeArray[i][j][k] = "one";
                            break;
                        case 2:
                            strThreeArray[i][j][k] = "two";
                            break;
                        case 3:
                            strThreeArray[i][j][k] = "three";
                            break;
                        case 4:
                            strThreeArray[i][j][k] = "four";
                            break;
                        case 5:
                            strThreeArray[i][j][k] = "five";
                            break;
                        case 6:
                            strThreeArray[i][j][k] = "six";
                            break;
                        case 7:
                            strThreeArray[i][j][k] = "seven";
                            break;
                        case 8:
                            strThreeArray[i][j][k] = "eight";
                            break;
                        case 9:
                            strThreeArray[i][j][k] = "nine";
                            break;
                        case 10:
                            strThreeArray[i][j][k] = "ten";
                            break;
                    }
                }
            }
        }
        System.out.println("Трехмерный массив из чисел " + "\n" + Arrays.deepToString(threeArray));
        System.out.println("Трехмерный массив из слов " + "\n" + Arrays.deepToString(strThreeArray));
    }

    static void taskThreeNArrays() {
        Scanner in = new Scanner(System.in);
        int size1, size2;
        System.out.println("\n" + "Задание 3" + "\n");
        System.out.print("Число строк для двумерного массива: ");
        size1 = in.nextInt();
        System.out.print("Число столбцов для двумерного массива: ");
        size2 = in.nextInt();
        int[][] twoArray = new int[size1][size2];
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = ((int) (Math.random() * 100));
            }
        }
        System.out.println("Исходный двумерный массив: " + "\n" + Arrays.deepToString(twoArray));
        int number;
        boolean flag = true;
        System.out.print("Введите число: ");
        number = in.nextInt();
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                while (flag) {
                    if (twoArray[i][j] % number != 0) {
                        System.out.println(twoArray[i][j]);
                    } else {
                        System.out.println("Найден искомый элемент");
                        flag = false;
                    }
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println("Искомый элемент не найден");
        }
    }
}
