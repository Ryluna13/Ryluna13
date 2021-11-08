package DEVER.Controller;

import DEVER.Model.AlunoModel;
import DEVER.Model.MatriculaModel;
import DEVER.Model.TurmaModel;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MatriculaController {
    private static void imprime(MatriculaModel matriculas){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data :" + matriculas.getData().format(formatar));
        System.out.println("---------Aluno--------- ");
        AlunoController.imprime(matriculas.getAluno());
        System.out.println("---------Turma--------- ");
        TurmaController.imprime(matriculas.getTurma());
    }

    public static void cadastra(ArrayList<MatriculaModel> matriculas,
                                ArrayList<AlunoModel> alunos,
                                ArrayList<TurmaModel> turmas){
        Scanner get = new Scanner(System.in);
        MatriculaModel matricula = new MatriculaModel();

        System.out.println("------- Cadastro de Matriculas --------");

        System.out.println("-------        Alunos          --------");
        AlunoController.getALl(alunos);
        System.out.println("Qual Aluno? N° :");
        matricula.setAluno(alunos.get(get.nextInt()-1));

        System.out.println("-------        Turmas         --------");
        TurmaController.getAll(turmas);
        System.out.println("Qual Turma? N° :");
        matricula.setTurma(turmas.get(get.nextInt()-1));

        matriculas.add(matricula);
        System.out.println("\n Matricula N°: " + matriculas.size() +" realizada!\n" );

    }

    public static void relatarMatriculas(ArrayList<MatriculaModel> matriculas){
        ComparaMatricula compara = new ComparaMatricula();
        ArrayList<MatriculaModel> aux = matriculas;
        for (int i = 0; i < matriculas.size(); i++) {
            System.out.println("Nº " + (i+1));
            imprime(matriculas.get(i));
            System.out.println("------------------------------------");
        }
        Collections.sort(aux,compara);

        for(MatriculaModel matricula : aux){
            imprime(matricula);
        }
    }
    


}
class ComparaMatricula implements Comparator<MatriculaModel> {

    public int compare(MatriculaModel x, MatriculaModel y){
        return x.getAluno().getNome().compareTo(y.getAluno().getNome());
    }

}

