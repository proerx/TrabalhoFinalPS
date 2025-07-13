package service;

import model.Atividade;
import model.Modalidade;

import java.util.Arrays;
import java.util.List;

public class ExtensaoAtividadeProvider implements AtividadeProvider {
    @Override
    public List<Atividade> obterAtividades() {
        return Arrays.asList(
            new Atividade("Participação em programa ou projeto de extensão", 60, Modalidade.EXTENSAO),
            new Atividade("Apresentação de projeto de extensão", 20, Modalidade.EXTENSAO),
            new Atividade("Participação em ações sociais, cívicas e comunitárias", 40, Modalidade.EXTENSAO),
            new Atividade("Texto em jornal ou revista da área", 40, Modalidade.EXTENSAO),
            new Atividade("Intercâmbio com instituições de ensino no Brasil ou no exterior", 100, Modalidade.EXTENSAO),
            new Atividade("Estágio não obrigatório na área do curso, formalizado pelo IFSC", 100, Modalidade.EXTENSAO),
            new Atividade("Exercício profissional com vínculo empregatício na área do curso", 100, Modalidade.EXTENSAO)
        );
    }
}
