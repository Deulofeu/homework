package com.example.homework.lesson15.homework;

public class FastElevatorRunnable implements Runnable {
    Elevators fastElevator;

    FastElevatorRunnable(Elevators fastElevator) {
        this.fastElevator = fastElevator;
    }

    public void run() {
        while (true) {
            int people = fastElevator.getPeople();
            if (people > 0) {
                fastElevator.putFastElevator();
            } else {
                return;
            }
        }
    }

    public void getUpOnFastElevator() {
        System.out.println("Всего на скоростном лифте - " + fastElevator.getUpPeopleOnFastElevator());
    }
}