package org.example;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("joao");
        Animal c = new Cachorro("rex");
        Animal g = new Gato("felix");

        p.chama(c);
        p.chama(g);
    }
}
