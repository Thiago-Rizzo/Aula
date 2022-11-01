package org.example;

public class Pessoa {
    private final String name;

    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void chama(Animal animal) {
        System.out.println(this.getName() + " chamou " + animal.getName());
        animal.run();
        System.out.println("--------------------------------------------------");
    }
}
