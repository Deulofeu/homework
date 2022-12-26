package com.example.homework.lesson15.homework;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int people;
        while ((people = checkInput()) > 0) {
            Elevators elevators = new Elevators(people);
            BigElevatorRunnable bigElevatorRunnable = new BigElevatorRunnable(elevators);
            Thread runBigElevator = new Thread(bigElevatorRunnable);
            FastElevatorRunnable fastElevatorRunnable = new FastElevatorRunnable(elevators);
            Thread runFastElevator = new Thread(fastElevatorRunnable);
            runFastElevator.start();
            runBigElevator.start();
            while (true) {
                if (runBigElevator.isAlive() || runFastElevator.isAlive()) {
                    continue;
                } else {
                    fastElevatorRunnable.getUpOnFastElevator();
                    bigElevatorRunnable.getUpOnBigElevator();
                    break;
                }
            }
        }
    }

    private static int checkInput() {
        System.out.print("Введите количество человек: ");
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int people = Integer.parseInt(in.nextLine());
                return people;
            } catch (NumberFormatException e) {
                System.out.println("Неправильный ввод. Введите количество человек: ");
            }
        }
    }
}
