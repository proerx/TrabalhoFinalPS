package service;

import model.Atividade;
import model.Modalidade;

import java.util.Arrays;
import java.util.List;

public class PesquisaAtividadeProvider implements AtividadeProvider {
    @Override
    public List<Atividade> obterAtividades() {
        return Arrays.asList(
            new Atividade("Participação em programa ou projeto de pesquisa relacionados à área", 60, Modalidade.PESQUISA),
            new Atividade("Apresentação de projeto de pesquisa relacionado à área", 20, Modalidade.PESQUISA),
            new Atividade("Autoria ou coautoria de artigo publicado em periódico na área afim", 30, Modalidade.PESQUISA),
            new Atividade("Livro na área afim", 100, Modalidade.PESQUISA),
            new Atividade("Capítulo de livro na área afim", 30, Modalidade.PESQUISA),
            new Atividade("Publicação em anais de evento técnico-científico", 30, Modalidade.PESQUISA),
            new Atividade("Apresentação de trabalho em evento técnico-científico", 20, Modalidade.PESQUISA),
            new Atividade("Participação em programa de iniciação científica", 60, Modalidade.PESQUISA),
            new Atividade("Participação como palestrante, conferencista, integrante de mesa-redonda ou ministrante de minicurso em evento científico", 60, Modalidade.PESQUISA),
            new Atividade("Prêmio concedido por instituição acadêmica, científica ou profissional", 60, Modalidade.PESQUISA),
            new Atividade("Participação na criação de produto ou processo tecnológico com propriedade intelectual registrada", 200, Modalidade.PESQUISA),
            new Atividade("Participação em grupo de pesquisa na área", 60, Modalidade.PESQUISA)
        );
    }
}
