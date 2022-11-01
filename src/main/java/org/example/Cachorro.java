package org.example;

public class Cachorro extends Animal implements Locomovivel {
    public Cachorro(String name) {
        super(name);
    }

    @Override
    public void locomover() {
        System.out.println(this.getName() + " corre abanando o rabo.");
    }
}
