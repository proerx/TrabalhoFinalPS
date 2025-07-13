package model;

public class Curso {
    private String nome;
    private int cargaHorariaMinima;

    public Curso(String nome, int cargaHorariaMinima) {
        this.nome = nome;
        this.cargaHorariaMinima = cargaHorariaMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHorariaMinima() {
        return cargaHorariaMinima;
    }
}