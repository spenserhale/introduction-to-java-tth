package com.tth;

public class Main {

    public static void main(String[] args) {
        Object[] list = {new Dog("Woof!"), new DogFod()};

        // With Variable
        Dog dog = (Dog) list[0];
        dog.findFood();

        // Anonymous with cast
        ((Dog)list[0]).makeSound();

        // instanceof example
        for (Object object : list) {
            if(object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }

        Dog dog2 = new Dog("Bark!!");
        System.out.println(dog);
        System.out.println(dog2);

        if(dog.equals(dog2)) {
            System.out.println("Dogs equal!");
        } else {
            System.out.println("dogs not equal!");
        }
    }
}
