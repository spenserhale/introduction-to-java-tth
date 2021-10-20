package com.tth;

public class Dog extends Animal {

    Dog(String sound) {
        super(sound);
    }

    @Override
    void findFood() {
        System.out.println("*looks at human*");
        makeSound();
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("*wags tail*");
    }
}
