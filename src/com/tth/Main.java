package com.tth;

public class Main {

    public static void main(String[] args) {
        Object[] list = {new Dog(), new DogFod()};

        // With Variable
        Dog dog = (Dog) list[0];
        dog.makeSound();

        // Anonymous
        ((Dog)list[0]).makeSound();

        // instanceof example
        for (Object object : list) {
            if(object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }

        // Base Object Methods
        System.out.println(dog.toString());
    }
}
