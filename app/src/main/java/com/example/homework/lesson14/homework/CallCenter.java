package com.example.homework.lesson14.homework;

import java.util.ArrayList;

public class CallCenter {
    private static int checkCall;

    public static void main(String[] args) {
        ArrayList<IncomingCall> listOfCalls = new ArrayList<>();
        listOfCalls.add(new IncomingCall(randomId(), "Поговорить"));
        listOfCalls.add(new IncomingCall(randomId(), "Заказать такси"));
        listOfCalls.add(new IncomingCall(randomId(), "Заказать пиццу"));
        listOfCalls.add(new IncomingCall(randomId(), "Позвонить в банк"));
        listOfCalls.add(new IncomingCall(randomId(), "Записаться на стрижку"));
        listOfCalls.add(new IncomingCall(randomId(), "Заказать суши"));
        listOfCalls.add(new IncomingCall(randomId(), "Купить что-нибудь"));
        listOfCalls.add(new IncomingCall(randomId(), "Поговорить о погоде"));

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

    public static int randomId() {
        return (int) (Math.random() * 999);
    }
}
