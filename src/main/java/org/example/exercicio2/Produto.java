package org.example.exercicio2;

public class Produto {
    private String nome;
    private Double preco;
    private String descricao;

    public Produto(String nome, Double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de informática";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
