package org.example;

public class Pessoa {
    private String name;

    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void chama(Locomovivel locomovivel) {
        System.out.println(this.getName() + " chamou " + locomovivel.getName());
        locomovivel.locomover();
        System.out.println("--------------------------------------------------");
    }
}
