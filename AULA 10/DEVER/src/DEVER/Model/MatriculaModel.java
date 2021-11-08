package DEVER.Model;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class MatriculaModel implements  Comparable<MatriculaModel> {
    private AlunoModel aluno;
    private TurmaModel turma;
    private LocalDate data = LocalDate.now();

    public AlunoModel getAluno() {
        return aluno;
    }

    public void setAluno(AlunoModel aluno) {
        this.aluno = aluno;
    }

    public TurmaModel getTurma() {
        return turma;
    }

    public void setTurma(TurmaModel turma) {
        this.turma = turma;

    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int compareTo(MatriculaModel matricula) {
        return this.aluno.getNome().compareTo(matricula.aluno.getNome());
    }

}
