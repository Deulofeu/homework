package com.example.homework.lesson14.homework;

import java.util.ArrayList;

public class CallCenter {
    private static int checkCall;

    public static void main(String[] args) {
        ArrayList<IncomingCall> listOfCalls = new ArrayList<>();
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Поговорить"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Заказать такси"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Заказать пиццу"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Позвонить в банк"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Записаться на стрижку"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Заказать суши"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Купить что-нибудь"));
        listOfCalls.add(new IncomingCall((int) (Math.random() * 999), "Поговорить о погоде"));
        Runnable myRunnable = () -> {
            for (int i = 0; i < listOfCalls.size(); i++) {
                synchronized (listOfCalls) {
                    if (i == checkCall) {
                        System.out.print((i + 1) + ") id звонка: " + listOfCalls.get(i).getIdCall() + "; " +
                                "Цель звонка: " + listOfCalls.get(i).getPurposeCall() + "; " +
                                "Обработан работником  " + Thread.currentThread().getName() + "\n");
                        checkCall += 1;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread myFirstThread = new Thread(myRunnable);
        Thread mySecondThread = new Thread(myRunnable);
        Thread myThirdThread = new Thread(myRunnable);

        myFirstThread.setName("1");
        mySecondThread.setName("2");
        myThirdThread.setName("3");

        myFirstThread.start();
        mySecondThread.start();
        myThirdThread.start();
    }
}
