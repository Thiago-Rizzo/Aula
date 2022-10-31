package org.example;

public class Cachorro extends Animal{

    public Cachorro(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " corre abanando o rabo.");
    }
}
