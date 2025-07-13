package service;

import model.Curso;
import model.Modalidade;
import model.RegistroAtividade;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GeradorParecer {
    public static void gerar(String matricula, Curso curso, List<RegistroAtividade> registros) {
        System.out.println("\n=== PARECER DE VALIDAÇÃO ===");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Data emissão: " + LocalDate.now());

        // Agrupar registros por modalidade
        Map<Modalidade, List<RegistroAtividade>> porModalidade = registros.stream()
            .collect(Collectors.groupingBy(r -> r.getAtividade().getModalidade()));

        int contadorAtividades = 1;
        int totalDeclaradas = 0;
        int totalValidadas = 0;

        for (Modalidade modalidade : Modalidade.values()) {
            List<RegistroAtividade> listaModalidade = porModalidade.get(modalidade);
            if (listaModalidade == null || listaModalidade.isEmpty()) continue;

            System.out.println("\n== Modalidade: " + modalidade.name() + " ==");

            for (RegistroAtividade reg : listaModalidade) {
                System.out.printf("\nAtividade %d:\n", contadorAtividades++);
                System.out.println("  Descrição:        " + reg.getAtividade().getDescricao());
                System.out.println("  Horas declaradas: " + reg.getHorasDeclaradas() + "h");
                System.out.println("  Limite Máximo:    " + reg.getAtividade().getLimiteHoras() + "h");
                System.out.println("  Horas validadas:  " + reg.getHorasValidadas() + "h");
                System.out.println("  Observação:       " + reg.getObservacao());

                totalDeclaradas += reg.getHorasDeclaradas();
                totalValidadas += reg.getHorasValidadas();
            }
        }

        System.out.println("\nResumo geral:");
        System.out.println("  Total de horas declaradas: " + totalDeclaradas + "h");
        System.out.println("  Total de horas validadas:  " + totalValidadas + "h");

        if (totalValidadas >= curso.getCargaHorariaMinima()) {
            System.out.println("  Situação: ✅ Requisito mínimo atendido (" + curso.getCargaHorariaMinima() + "h).");
        } else {
            System.out.println("  Situação: ❌ Faltam " + (curso.getCargaHorariaMinima() - totalValidadas) + "h para atingir o mínimo de " + curso.getCargaHorariaMinima() + "h.");
        }
    }
}
