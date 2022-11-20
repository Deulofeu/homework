package com.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkNArrays {
    public static void main(String[] args) {
        taskOneNArrays();
    }

    static void taskOneNArrays() {
        int size1, size2;
        Scanner in = new Scanner(System.in);
        System.out.print("Число строк: ");
        size1 = in.nextInt();
        System.out.print("Число столбцов: ");
        size2 = in.nextInt();
        int[][] twoArray = new int[size1][size2];
        int newSize = size1 * size2;
        int[] oneArray = new int[newSize];
        int temp = 0;
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = ((int) (Math.random() * 100));
                System.out.print(twoArray[i][j] + " ");
                oneArray[temp] = twoArray[i][j];
                temp++;
            }
            System.out.println("");
        }
        System.out.println("Одномерный массив из двумерного: " + Arrays.toString(oneArray));
    }
}
