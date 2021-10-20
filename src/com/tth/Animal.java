package com.tth;

import java.util.Objects;

public abstract class Animal {
    String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    abstract void findFood();

    void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }
}
