package org.example.exercicio1;

public class Capitulo {
    private String titulo;
    private Integer numeroPaginas;
    private String sobrenomeAutor;

    public Capitulo(String titulo, Integer numeroPaginas, String sobrenomeAutor) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.sobrenomeAutor = sobrenomeAutor;
    }

    @Override
    public String toString() {
        return  "--------------- Capitulo -----------------\n" +
                "titulo: " + this.titulo + "\n" +
                "numeroPaginas: " + this.numeroPaginas + "\n" +
                "sobrenomeAutor: " + this.sobrenomeAutor + "\n";
    }
}
