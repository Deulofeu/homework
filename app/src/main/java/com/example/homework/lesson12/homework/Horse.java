package com.example.homework.lesson12.homework;

import java.util.Objects;

public class Horse extends Pet {
    private int age;

    Horse(String name, String breed, int age) {
        super(name, breed);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name - " + getName() + "; Breed - " + getBreed() + "; Age - " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return age == horse.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }
}
