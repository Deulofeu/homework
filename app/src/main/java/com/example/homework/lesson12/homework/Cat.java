package com.example.homework.lesson12.homework;

import java.util.Objects;

public class Cat extends Pet {
    private String color;

    Cat(String name, String breed, String color) {
        super(name, breed);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Name - " + getName() + "; Breed - " + getBreed() + "; Color - " + getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
