package org.example;

public class Gato extends Animal implements Locomovivel {

    public Gato(String name) {
        super(name);
    }

    @Override
    public void locomover() {
        System.out.println(this.getName() + " anda miando...");
    }
}
