package org.example.exercicio3e4;

public class Livro extends Produto{
    private String autor;

    public Livro(String descricao) {
        super(descricao);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " " + this.autor;
    }
}
