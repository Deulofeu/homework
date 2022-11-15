package com.example.homework3;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        taskOneArrays();
    }

    static void taskOneArrays() {
        String[] names = new String[]{"Nikita", "Ivan", "Igor", "Alexei"};
        Arrays.sort(names);
        System.out.println("Отсортированный массив имен - " + Arrays.toString(names));
    }
}
