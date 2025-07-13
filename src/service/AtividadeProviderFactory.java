package service;

import model.Modalidade;

public class AtividadeProviderFactory {

    public static AtividadeProvider getProvider(Modalidade modalidade) {
        return switch (modalidade) {
            case ENSINO -> new EnsinoAtividadeProvider();
            case PESQUISA -> new PesquisaAtividadeProvider();
            case EXTENSAO -> new ExtensaoAtividadeProvider();
            case COMPLEMENTACAO -> new ComplementacaoAtividadeProvider();
        };
    }
}
