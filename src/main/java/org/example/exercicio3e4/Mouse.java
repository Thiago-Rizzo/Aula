package org.example.exercicio3e4;

public class Mouse extends Produto{
    private String tipo;

    public Mouse(String descricao) {
        super(descricao);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " " + this.tipo;
    }
}
