package com.tth;

public class Dog extends Animal {
    Dog() {
        super("Woof!");
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("*wags tail*");
    }
}
