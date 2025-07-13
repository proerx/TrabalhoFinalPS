package model;

public class Atividade {
    private String descricao;
    private int limiteHoras;
    private Modalidade modalidade;

    public Atividade(String descricao, int limiteHoras, Modalidade modalidade) {
        this.descricao = descricao;
        this.limiteHoras = limiteHoras;
        this.modalidade = modalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getLimiteHoras() {
        return limiteHoras;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }
}
