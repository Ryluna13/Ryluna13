package View;

import Controller.AlunoController;
import Model.AlunoModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<AlunoModel> Alunos){
        while (0==0){

            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("==============================================");
            System.out.println("=========== Biblioteca Principal =============");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Imprimir");
            System.out.println("(3) Excluir");
            System.out.println("(0)## SAIR ##");
            System.out.print("Escolha uma opção acima: ");
            opcao = get.nextInt();

            switch(opcao){
                case 1://cadastar
                    cadastra(Alunos);
                    break;

                case 2://Consultar
                    imprime(Alunos);
                    break;

                case 3://Excluir
                    break;

                case 0://sair
                    System.exit(1);
                    break;

                default:
                    System.out.println("\n\n Opção Inválida\n\n");


            }


        }//fim do while

    }//fim principal
    public static void cadastra(ArrayList<AlunoModel> Alunos){


        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("================ Cadastro =================");
        System.out.println("(1)Aluno");
        System.out.print("Escolha uma opção acima: ");
        opcao = get.nextInt();

        switch(opcao){
            case 1://Livro
                AlunoController.cadastra(Alunos);
                break;



            default:
                System.out.println("\n\n Opção Inválida\n\n");
        }
    }//fim cadastra
    public static void imprime(ArrayList<AlunoModel> Alunos) {
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("================ Imprime =================");
        System.out.println("(1)Alunos");
        System.out.print("Escolha uma opção acima: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                AlunoController.imprime(Alunos);
                break;



            default:
                System.out.println("\n\n Opção Inválida\n\n");
        }
    }
     // Função Excluir
    public static void exclui (ArrayList<AlunoModel> Alunos) {
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("================ Exclusão =================");
        System.out.println("(1)Aluno");
        System.out.print("Escolha uma opção acima: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                AlunoController.exclui(Alunos);
                break;



            default:
                System.out.println("\n\n Opção Inválida\n\n");
        }
    }
}

