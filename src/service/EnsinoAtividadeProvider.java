package service;

import model.Atividade;
import model.Modalidade;

import java.util.Arrays;
import java.util.List;

public class EnsinoAtividadeProvider implements AtividadeProvider {
    @Override
    public List<Atividade> obterAtividades() {
        return Arrays.asList(
            new Atividade("Disciplinas cursadas com aproveitamento, não previstas no currículo do curso", 80, Modalidade.ENSINO),
            new Atividade("Série acadêmica dos cursos, quando não obrigatória", 40, Modalidade.ENSINO),
            new Atividade("Participação em atividades de monitoria", 70, Modalidade.ENSINO),
            new Atividade("Atividades realizadas em laboratórios e/ou oficinas do Instituto", 40, Modalidade.ENSINO),
            new Atividade("Visita técnica relacionada à área", 40, Modalidade.ENSINO),
            new Atividade("Participação em cursos de qualificação na área afim do curso com certificado de aproveitamento", 80, Modalidade.ENSINO),
            new Atividade("Participação como ouvinte em bancas de projetos integradores de assuntos relacionados à área", 20, Modalidade.ENSINO),
            new Atividade("Participação como ouvinte em bancas de TCC, dissertações ou teses de assuntos relacionados à área", 20, Modalidade.ENSINO),
            new Atividade("Desenvolvimento de material didático ou instrucional", 30, Modalidade.ENSINO),
            new Atividade("Instrutor de cursos abertos à comunidade", 70, Modalidade.ENSINO)	
        );
    }
}
