package org.example.exercicio1;

import org.example.exercicio1.Capitulo;
import org.example.exercicio1.Livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Panini", "DC: Heroes", 2019, 1, 129.90);
        Livro l2 = new Livro("Abril", "Marvel: Heroes", 2018, 15, 299.90);
        Livro l3 = new Livro("Clarim Diario", "Doctor Who: 51 historias", 2012, 2, 51.39);
        Livro l4 = new Livro("Action Comics", "Batman que ri", 1948, 1, 0.02);

        l1.setCapitulo(new Capitulo("Batman", 10, "Homelander"));
        l1.setCapitulo(new Capitulo("Superman", 12, "Homelander"));
        l1.setCapitulo(new Capitulo("Shazam", 5, "Homelander"));
        l1.setCapitulo(new Capitulo("The Flash", 25, "Homelander"));

        l2.setCapitulo(new Capitulo("Homem Aranha", 5, "Lee"));
        l2.setCapitulo(new Capitulo("Wolverine", 7, "Lee"));
        l2.setCapitulo(new Capitulo("Capitão America", 10, "Lee"));
        l2.setCapitulo(new Capitulo("Thor", 11, "Lee"));

        l3.setCapitulo(new Capitulo("Capitulo 1", 9, "Moffatt"));
        l3.setCapitulo(new Capitulo("Capitulo 2", 18, "Moffatt"));
        l3.setCapitulo(new Capitulo("Capitulo 3", 12, "Moffatt"));
        l3.setCapitulo(new Capitulo("Capitulo 4", 6, "Moffatt"));

        l4.setCapitulo(new Capitulo("Origem", 3, "Zolomon"));
        l4.setCapitulo(new Capitulo("Primeiro Crime", 2, "Zolomon"));
        l4.setCapitulo(new Capitulo("Ch?r?d?", 25, "Zolomon"));
        l4.setCapitulo(new Capitulo("Ultima Piada", 20, "Zolomon"));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }
}
