package model;

public class RegistroAtividade {
    private Atividade atividade;
    private int horasDeclaradas;
    private int horasValidadas;
    private String observacao;

    public RegistroAtividade(Atividade atividade, int horasDeclaradas) {
        this.atividade = atividade;
        this.horasDeclaradas = horasDeclaradas;
        this.horasValidadas = Math.min(horasDeclaradas, atividade.getLimiteHoras());
        this.observacao = horasDeclaradas > atividade.getLimiteHoras()
                ? "Horas declaradas (" + horasDeclaradas + "h) excedem o limite (" + atividade.getLimiteHoras() + "h); ajustadas para " + horasValidadas + "h."
                : "-- (sem ajuste)";
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public int getHorasDeclaradas() {
        return horasDeclaradas;
    }

    public int getHorasValidadas() {
        return horasValidadas;
    }

    public String getObservacao() {
        return observacao;
    }
}