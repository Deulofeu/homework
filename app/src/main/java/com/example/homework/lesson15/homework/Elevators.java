package com.example.homework.lesson15.homework;

public class Elevators {
    private Integer people;
    private int upPeopleOnBigElevator = 0;
    private int upPeopleOnFastElevator = 0;
    final int MAX_BIG_ELEVATOR = 10;
    final int MAX_FAST_ELEVATOR = 6;

    Elevators(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public int getUpPeopleOnBigElevator() {
        return upPeopleOnBigElevator;
    }

    public int getUpPeopleOnFastElevator() {
        return upPeopleOnFastElevator;
    }

    public  int putBigElevator() {
        int raised;
        synchronized (people) {
            if (people > 0) {
                if (people >= MAX_BIG_ELEVATOR) {
                    raised = MAX_BIG_ELEVATOR;
                } else {
                    raised = people;
                }
                people -= raised;
                upPeopleOnBigElevator += raised;
                try {
                    Thread.sleep(2000);
                    System.out.println("Большой лифт поднял " + raised);
                    Thread.sleep(2000);
                    return people;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return 0;
        }
    }

    public  int putFastElevator() {
        int raised;
        synchronized (people) {
            if (people > 0) {
                if (people >= MAX_FAST_ELEVATOR) {
                    raised = MAX_FAST_ELEVATOR;
                } else {
                    raised = people;
                }
                people -= raised;
                upPeopleOnFastElevator += raised;
                try {
                    Thread.sleep(1000);
                    System.out.println("Скоростной лифт поднял " + raised);
                    Thread.sleep(1000);
                    return people;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return 0;
        }
    }
}
