package org.example;

public class Gato implements Animal {
    private final String name;

    public Gato(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " anda miando...");
    }
}
