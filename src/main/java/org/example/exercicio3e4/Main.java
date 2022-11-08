package org.example.exercicio3e4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Mouse ótico, Saida USB. 1.600 dpi");
        Livro l1 = new Livro("Um livro muito bom compra ai po");
        Mouse m2 = new Mouse("Mouse numero 2");
        Livro l2 = new Livro("Cinquenta tons de cinza");
        Mouse m3 = new Mouse("Mouse numero 3");
        Livro l3 = new Livro("Cinquenta tons mais escuros");
        Mouse m4 = new Mouse("Mouse numero 4");
        Livro l4 = new Livro("Cinquenta tons de preto");

        ArrayList<Produto> carrinho = new ArrayList<>();

        carrinho.add(m1);
        carrinho.add(l1);
        carrinho.add(m2);
        carrinho.add(l2);
        carrinho.add(m3);
        carrinho.add(l3);
        carrinho.add(m4);
        carrinho.add(l4);

        System.out.println("Carrinho de Compras: \n");
        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
        }
    }
}
