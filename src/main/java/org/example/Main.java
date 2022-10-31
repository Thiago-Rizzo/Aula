package org.example;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("joao");
        Cachorro c = new Cachorro("rex");
        Gato g = new Gato("felix");

        p.chama(c);
        p.chama(g);
    }
}