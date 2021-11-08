package DEVER.View;

import DEVER.Controller.AlunoController;
import DEVER.Controller.MatriculaController;
import DEVER.Controller.TurmaController;
import DEVER.Model.AlunoModel;
import DEVER.Model.MatriculaModel;
import DEVER.Model.TurmaModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<AlunoModel> alunos,
                                 ArrayList<TurmaModel> turmas,
                                 ArrayList<MatriculaModel> matriculas) {
        while(0==0){
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("===================================");
            System.out.println("======= Colégio Santa Monica ======");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");

            System.out.println("(2)Excluir");
            System.out.println("(3)Relatórios");
            System.out.println("(0)Sair");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastrar(alunos,turmas,matriculas);
                    break;

                case 2: //excluir
                    exclui(alunos,turmas);
                    break;

                case 3: //relatórios
                    relatar(alunos,turmas,matriculas);
                    break;

                case 0://sair
                    System.exit(1);
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }
    }

    public static void cadastrar(ArrayList<AlunoModel> alunos,
                                 ArrayList<TurmaModel> turmas,
                                 ArrayList<MatriculaModel> matriculas ){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Cadastros =======");
        System.out.println("(1)Alunos");
        System.out.println("(2)Turmas");
        System.out.println("(3)Matriculas");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1://Aluno
                AlunoController.cadastra(alunos);
                break;
            case 2://Turma
                TurmaController.cadastra(turmas);
                break;
            case 3://Matriculas
                MatriculaController.cadastra(matriculas, alunos, turmas);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void exclui(ArrayList<AlunoModel> alunos,
                              ArrayList<TurmaModel> turmas
                              ) {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Exclusão =======");
        System.out.println("(1)Aluno");
        System.out.println("(2)Turmas");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Aluno
                AlunoController.exclui(alunos);
                break;
            case 2://Turma
                TurmaController.exclui(turmas);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void relatar(ArrayList<AlunoModel> alunos,
                               ArrayList<TurmaModel> turmas,
                               ArrayList<MatriculaModel> matriculas ){
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Relatórios =======");
        System.out.println("(1) Todos Alunos");
        System.out.println("(2) Aluno maiores de idade");
        System.out.println("(3) Aluno menores de idade");
        System.out.println("(4) Aluno menos de idade do sexo Masxculino");
        System.out.println("(5) Aluno menos de idade do sexo Feminino");
        System.out.println("(6) Aniversariante do Mes");
        System.out.println("(7) Aluno Mais velho Masculino");
        System.out.println("(8) Aluno Mais novo Masculino");
        System.out.println("(9) Aluno Mais velha Feminino");
        System.out.println("(10) Aluno Mais nova Feminino");
        System.out.println("(11) Relatar Turmas");
        System.out.println("(12) Relatar Matriculas");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Aluno maiores de idade
                AlunoController.getALl(alunos);
                break;
            case 2://Aluno maiores de idade
                AlunoController.relatarAlunosMaioresDeIdade(alunos);
                break;
            case 3://Aluno menores de idade
                AlunoController.relataAlunosMenosDeIdade(alunos);
                break;
            case 4://Aluno menos de idade do sexo masxculinoi
                AlunoController.relataAlunosMenoresDeIdadeDoSexoMasculino(alunos);
                break;
            case 5://Aluno menos de idade do sexo feminino
                AlunoController.relataAlunosMenoresdeIdadedoSexoFeminino(alunos);
                break;
            case 6://O aniversariante do mes
                AlunoController.relatarAniversarianteDoMes(alunos);
                break;
            case 7://O Aluno Mais velho Masculino
                AlunoController.relatarMasculinoMaisVelho(alunos);
                break;
            case 8://O Aluno Mais novo Masculino
                AlunoController.relatarMasculinoMaisNovo(alunos);
                break;
            case 9://O Aluno Mais velho feminino
                AlunoController.relatarFemininoMaisVelha(alunos);
                break;
            case 10://O Aluno Mais novo feminino
                AlunoController.relatarFemininaMaisNova(alunos);
                break;
            case 11: // Mostrar Todas Turmas
                TurmaController.getAll(turmas);
                break;
            case 12: // Mostra Todas Matriculas
                MatriculaController.relatarMatriculas(matriculas);
                break;
            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }
}
