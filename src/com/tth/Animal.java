package com.tth;

public class Animal {
    String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }
}
