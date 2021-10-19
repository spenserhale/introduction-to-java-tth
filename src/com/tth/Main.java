package com.tth;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.exit(1);
        }
        console.printf("Hello World");
    }
}
