package com.tth;

public class Main {

    public static void main(String[] args) {
        // Create Objects
        ShopKeeper shopKeeper = new ShopKeeper("Larry");
        Teacup teacup = new Teacup();
        String treehouse = "Treehouse";

        // Loop through Objects
        Object[] objects = {shopKeeper, teacup, treehouse};

        for (Object object : objects) {
            if (object instanceof Chattable) {
                String response = ((Chattable) object).chat();
                System.out.println(response);
            }
        }

        // Loop through Chattables
        Chattable[] chattables = {shopKeeper, teacup};

        for (Chattable chattable : chattables) {
            String response = chattable.chat();
            System.out.println(response);
        }
    }

    private static void animalExamples() {
        Object[] list = {new Dog("Woof!"), new DogFod()};

        // With Variable
        Dog dog = (Dog) list[0];
        dog.findFood();

        // Anonymous with cast
        ((Dog) list[0]).makeSound();

        // instanceof example
        for (Object object : list) {
            if (object instanceof Animal) {
                ((Animal) object).makeSound();
            }
        }

        Dog dog2 = new Dog("Bark!!");
        System.out.println(dog);
        System.out.println(dog2);

        if (dog.equals(dog2)) {
            System.out.println("Dogs equal!");
        } else {
            System.out.println("dogs not equal!");
        }
    }
}
