package com.example.homework.lesson1_7;

public class Phone {
    private SimCard sim;

    public Phone(SimCard sim) {
        this.sim = sim;
    }

    void insertNewSim(SimCard newSim) {
        this.sim = newSim;
        System.out.println("Номер: " + newSim.getNumber() + "\nОператор: " + newSim.getOperatorName() + "\nБаланс: " + newSim.getBalance());
    }

    void makeCall(String number) {
        sim.makeCall(number);
    }

    void receiveCall(String number) {
        sim.receiveCall(number);
    }

    void printBalance() {
        System.out.println("Ваш баланс: " + sim.getBalance());
    }
}
