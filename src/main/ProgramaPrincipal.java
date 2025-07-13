package main;

import model.*;
import service.*;
import util.LeitorConsole;

import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        final String matricula = "202500789";
        AvaliadorAtividade avaliador = AvaliadorAtividade.getInstancia();

        List<Curso> cursos = CursoFactory.listarCursos();
        System.out.println("== Cursos Disponíveis ==");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.printf("%d) %s (mínimo %dh)%n", i + 1, cursos.get(i).getNome(), cursos.get(i).getCargaHorariaMinima());
        }

        int escolhaCurso;
        Curso curso;
        while (true) {
            escolhaCurso = LeitorConsole.lerInt("Escolha o curso (número): ");
            curso = CursoFactory.obterCurso(escolhaCurso);
            if (curso != null) break;
            System.out.println("Curso inválido. Tente novamente.");
        }

        while (true) {
            System.out.println("\n== Menu de Modalidades ==");
            System.out.println("1) Ensino");
            System.out.println("2) Pesquisa");
            System.out.println("3) Extensão");
            System.out.println("4) Complementação");
            System.out.println("0) Finalizar e emitir parecer");

            int opcaoModalidade = LeitorConsole.lerInt("Escolha a modalidade (0-finalizar): ");
            if (opcaoModalidade == 0) break;

            Modalidade modalidade = switch (opcaoModalidade) {
                case 1 -> Modalidade.ENSINO;
                case 2 -> Modalidade.PESQUISA;
                case 3 -> Modalidade.EXTENSAO;
                case 4 -> Modalidade.COMPLEMENTACAO;
                default -> null;
            };

            if (modalidade == null) {
                System.out.println("Opção inválida.");
                continue;
            }

            AtividadeProvider provider = AtividadeProviderFactory.getProvider(modalidade);
            List<Atividade> lista = provider.obterAtividades();

            while (true) {
                System.out.println("\n-- Atividades em " + modalidade.name() + " --");
                for (int i = 0; i < lista.size(); i++) {
                    Atividade a = lista.get(i);
                    System.out.printf("%d) %s (limite %dh)\n", i + 1, a.getDescricao(), a.getLimiteHoras());
                }
                System.out.println("0) Voltar ao menu de modalidades");

                int opcaoAtividade = LeitorConsole.lerInt("Escolha a atividade (0-voltar): ");
                if (opcaoAtividade == 0) break;
                if (opcaoAtividade < 1 || opcaoAtividade > lista.size()) {
                    System.out.println("Atividade inválida.");
                    continue;
                }

                Atividade escolhida = lista.get(opcaoAtividade - 1);
                int horas = LeitorConsole.lerInt("Horas declaradas para '" + escolhida.getDescricao() + "': ");
                avaliador.registrar(escolhida, horas);
                System.out.println("Atividade adicionada ao requerimento.");
            }
        }

        GeradorParecer.gerar(matricula, curso, avaliador.getRegistros());
    }
}
