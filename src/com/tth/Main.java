package com.tth;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        listExamples();
    }

    private static void listExamples() {
        List<String> groceryLine = new ArrayList<>();

        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Sam");
        groceryLine.add("Tom");
        groceryLine.add("Harry");

        System.out.println(groceryLine);

        groceryLine.remove("Beth");
        groceryLine.remove(1);

        System.out.println(groceryLine);

        String jerome = groceryLine.get(0);
        System.out.println(jerome);

        int tomIndex = groceryLine.indexOf("Tom");
        System.out.println(tomIndex);

        System.out.println(groceryLine.size());

        for (String name : groceryLine) {
            System.out.println(name);
        }
    }

    private static void genericsExamples() {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box<Milk> boxOfMilk = new Box<>();
        Box<Oranges> boxOfOranges = new Box<>();

        debugAdd(milk, boxOfMilk);
        debugAdd(oranges, boxOfOranges);

        boxOfMilk.remove().drink();
        boxOfOranges.remove().juggle();
    }

    static <T> void debugAdd(T item, Box<T> box) {
        System.out.println("Type: " + item.getClass().getSimpleName());
        box.add(item);
    }

    private static void interfaceExamples() {
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
