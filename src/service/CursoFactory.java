package service;

import model.Curso;

import java.util.Arrays;
import java.util.List;

public class CursoFactory {
    private static final List<Curso> cursos = Arrays.asList(
        new Curso("Análise e Desenvolvimento de Sistemas", 100)
    );

    public static List<Curso> listarCursos() {
        return cursos;
    }

    public static Curso obterCurso(int index) {
        if (index >= 1 && index <= cursos.size()) {
            return cursos.get(index - 1);
        }
        return null;
    }
}