package service;

import model.Atividade;
import model.Modalidade;

import java.util.Arrays;
import java.util.List;

public class ComplementacaoAtividadeProvider implements AtividadeProvider {
    @Override
    public List<Atividade> obterAtividades() {
        return Arrays.asList(
        		new Atividade("Participação em congressos, jornadas, simpósios, fóruns, seminários, encontros, palestras, festivais e similares, com certificado de aproveitamento e/ou frequência", 20, Modalidade.COMPLEMENTACAO),
            new Atividade("Comissão organizadora de congressos, jornadas, simpósios, fóruns, seminários, encontros, palestras, festivais e similares", 20, Modalidade.COMPLEMENTACAO),
            new Atividade("Premiação em eventos que tenham relação com os objetos de estudo do curso", 30, Modalidade.COMPLEMENTACAO),
            new Atividade("Curso de língua estrangeira", 80, Modalidade.COMPLEMENTACAO),
            new Atividade("Premiação em atividades esportivas como representante do Instituto", 60, Modalidade.COMPLEMENTACAO),
            new Atividade("Representação estudantil em colegiado, grêmio estudantil, centro acadêmico, comissão de formatura, associação esportiva e afins", 40, Modalidade.COMPLEMENTACAO),
            new Atividade("Representação de turma (inclui participação em conselhos de classe)", 30, Modalidade.COMPLEMENTACAO),
            new Atividade("Participação em empresa júnior", 40, Modalidade.COMPLEMENTACAO),
            new Atividade("Classificação em concursos culturais", 20, Modalidade.COMPLEMENTACAO),
            new Atividade("Participação em projetos sociais, trabalho voluntário em entidades vinculadas a compromissos sociopolíticos", 20, Modalidade.COMPLEMENTACAO),
            new Atividade("Desenvolvimento de atividades socioculturais, artísticas e esportivas (coral, música, dança, bandas, vídeos, cinema, cineclubes, teatro, campeonatos esportivos etc.)", 20, Modalidade.COMPLEMENTACAO)
        );
    }
}
