package DEVER.View;

import DEVER.Controller.AlunoController;
import DEVER.Model.AlunoModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<AlunoModel> alunos) {
        while(0==0){
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("===================================");
            System.out.println("======= Colégio Santa Monica ======");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Consultar");
            System.out.println("(3)Excluir");
            System.out.println("(4)Relatórios");
            System.out.println("(0)Sair");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastrar(alunos);
                    break;

                case 2://consultar
                    consulta(alunos);
                    break;

                case 3: //excluir
                    exclui(alunos);
                    break;

                case 4: //relatórios
                    relatar(alunos);
                    break;

                case 0://sair
                    System.exit(1);
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }
    }

    public static void cadastrar(ArrayList<AlunoModel> alunos){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Cadastro =======");
        System.out.println("(1)Alunos");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1://Aluno
                AlunoController.cadastra(alunos);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void consulta(ArrayList<AlunoModel> alunos) {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Consultas =======");
        System.out.println("(1)Aluno");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Aluno
                AlunoController.imprime(alunos);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void exclui(ArrayList<AlunoModel> alunos) {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Exclusão =======");
        System.out.println("(1)Aluno");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Aluno
                AlunoController.exclui(alunos);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void relatar(ArrayList<AlunoModel> alunos){
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Relatórios =======");
        System.out.println("(1) Aluno maiores de idade");
        System.out.println("(2) Aluno menores de idade");
        System.out.println("(3) Aluno menos de idade do sexo Masxculino");
        System.out.println("(4) Aluno menos de idade do sexo Feminino");
        System.out.println("(5) Aniversariante do Mes");
        System.out.println("(6) Aluno Mais velho Masculino");
        System.out.println("(7) Aluno Mais novo Masculino");
        System.out.println("(8) Aluno Mais velho Feminino");
        System.out.println("(9) Aluno Mais novo Feminino");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Aluno maiores de idade
                AlunoController.relatarAlunosMaioresDeIdade(alunos);
                break;
            case 2://Aluno menores de idade
                AlunoController.relataAlunosMenosDeIdade(alunos);
            case 3://Aluno menos de idade do sexo masxculinoi
                AlunoController.relataAlunosMenoresDeIdadeDoSexoMasculino(alunos);
            case 4://Aluno menos de idade do sexo feminino
                AlunoController.relataAlunosMenoresdeIdadedoSexoFeminino(alunos);
            case 5://aniversariante do mes
                AlunoController.relatarAniversarianteDoMes(alunos);
            case 6://O Aluno Mais velho Masculino
                AlunoController.relatarMasculinoMaisVelho(alunos);
            case 7://O Aluno Mais novo Masculino
                AlunoController.relatarMasculinoMaisNovo(alunos);
            case 8://O Aluno Mais velho feminino
                AlunoController.relatarFemininoMaisVelha(alunos);
            case 9://O Aluno Mais novo feminino
                AlunoController.relatarFemininaMaisNova(alunos);

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }
}
