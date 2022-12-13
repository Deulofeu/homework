package com.example.homework.lesson12.homework;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static HashMap<String, Pet> pet = new HashMap<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Pet cat1 = new Cat("Chelsea", "siberian", "black");
        Pet dog1 = new Dog("Sharik", "cur", "big");
        Pet horse1 = new Horse("Pegasus", "albanian", 5);
        Pet cat2 = new Cat("Archie", "no breed", "grey");
        Pet horse2 = new Horse("Ghost", "bosnian", 3);
        pet.put(cat1.getName(), cat1);
        pet.put(cat2.getName(), cat2);
        pet.put(dog1.getName(), dog1);
        pet.put(horse1.getName(), horse1);
        pet.put(horse2.getName(), horse2);
        printInfoPet(pet);
        deletePetByName();
    }

    private static void printInfoPet(HashMap<String, Pet> pet) {
        for (Pet pets : pet.values()) {
            System.out.println(pets.toString());
        }
    }

    private static void deletePetByName() {
        System.out.println("Введите имя животного, которого нужно удалить");
        while (true) {
            String needDeletePet = in.nextLine();
            if (pet.containsKey(needDeletePet) != true) {
                System.out.println("Ошибка. Повторите ввод");
            } else {
                pet.remove(needDeletePet);
                printInfoPet(pet);
                break;
            }
        }
    }
}
