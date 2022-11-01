package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("joao");
        Locomovivel c = new Cachorro("rex");
        Locomovivel g = new Gato("felix");
        Animal e = new Esponja("Bob");

        p.chama(c);
        p.chama(g);
    }
}
