package org.example;

public class Cachorro implements Animal {
    private final String name;

    public Cachorro(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " corre abanando o rabo.");
    }
}
