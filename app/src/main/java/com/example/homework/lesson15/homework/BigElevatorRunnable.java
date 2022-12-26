package com.example.homework.lesson15.homework;

public class BigElevatorRunnable implements Runnable {
    Elevators bigElevator;

    BigElevatorRunnable(Elevators bigElevator) {
        this.bigElevator = bigElevator;
    }

    public void run() {
        while (true) {
            int people = bigElevator.getPeople();
            if (people > 0) {
                bigElevator.putBigElevator();
            } else {
                return;
            }
        }
    }

    public void getUpOnBigElevator() {
        System.out.println("Всего на большом лифте - " + bigElevator.getUpPeopleOnBigElevator());
    }
}