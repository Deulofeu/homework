package com.example.homework.lesson13.homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> randomArrayOfNumbers = initialize();
        System.out.print("все четные элементы в диапазоне от 7 до 17:");
        ArrayList<Integer> listOfNumbers = (ArrayList<Integer>) randomArrayOfNumbers.stream()
                .distinct()
                .filter(number -> number >= 7 && number <= 17 && number % 2 == 0)
                .peek(number -> System.out.print(number + " "))
                .map(number -> number * 2)
                .filter(number -> number > 10)
                .collect(Collectors.toList());
        System.out.println("\nПолученный список после всех методов: " + listOfNumbers);
        System.out.println("Количество элементов в стриме: " + listOfNumbers.stream().count());
        System.out.println("Среднее арифметическое всех элементов в стриме: " + listOfNumbers.stream().collect(Collectors.averagingInt(number -> number)));
    }


    private static ArrayList<Integer> initialize() {
        System.out.print("Введите размер ArrayList: ");
        while (true) {
            try {
                int size = Integer.parseInt(in.nextLine());
                for (int i = 0; i < size; i++) {
                    arrayList.add((int) (Math.random() * 30) + 1);
                }
                System.out.println("Исходный список чисел:" + arrayList);
                return arrayList;
            } catch (NumberFormatException e) {
                System.out.println("Неправильный ввод. Введите размер ArrayList:");
            }
        }
    }
}
