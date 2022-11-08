package org.example.exercicio1;

import java.util.ArrayList;

public class Livro {
    private String editor;
    private String tituloLivro;
    private Integer ano;
    private Integer edicao;
    private Double preco;
    private ArrayList<Capitulo> capitulos;

    public Livro(String editor, String tituloLivro, Integer ano, Integer edicao, Double preco) {
        this.editor = editor;
        this.tituloLivro = tituloLivro;
        this.ano = ano;
        this.edicao = edicao;
        this.preco = preco;
        this.capitulos = new ArrayList<>();
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulos.add(capitulo);
    }

    @Override
    public String toString() {
        return  "---------------- Livro ----------------\n" +
                "editor: " + this.editor + "\n" +
                "tituloLivro: " + this.tituloLivro + "\n" +
                "ano: " + this.ano + "\n" +
                "edicao: " + this.edicao + "\n" +
                "preco: " + this.preco + "\n" +
                "capitulos: \n" + this.capitulos;
    }
}
