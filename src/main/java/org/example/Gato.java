package org.example;

public class Gato extends Animal{

    public Gato(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " anda miando...");
    }
}
