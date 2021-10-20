package com.tth;

public class Person implements Chattable {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String chat() {
        return "Hi, I'm a person";
    }
}
