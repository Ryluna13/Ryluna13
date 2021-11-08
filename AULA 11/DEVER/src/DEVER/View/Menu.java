package DEVER.View;

import DEVER.Controller.CadastroController;
import DEVER.Model.CadastroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<CadastroModel> pessoas) {
        while(0==0){
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("===================================");
            System.out.println("=======  Criação De Perfil   ======");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");

            System.out.println("(2)Excluir");
            System.out.println("(3)Relatórios");
            System.out.println("(0)Sair");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastrar(pessoas);
                    break;

                case 2: //excluir
                    exclui(pessoas);
                    break;

                case 3: //relatórios
                    relatar(pessoas);
                    break;

                case 0://sair
                    System.exit(1);
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }
    }

    public static void cadastrar(ArrayList<CadastroModel> pessoas){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Cadastros =======");
        System.out.println("(1)Pessoa");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1://Aluno
                CadastroController.cadastra(pessoas);
                break;


            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void exclui(ArrayList<CadastroModel> pessoas) {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Exclusão =======");
        System.out.println("(1)Pessoa");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Aluno
                CadastroController.exclui(pessoas);
                break;


            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

    public static void relatar(ArrayList<CadastroModel> pessoas){
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Relatórios =======");
        System.out.println("(1) Todos Pessoas");
        System.out.println("(2) Todas Pessoas Por Idade");


        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1://Pegar Todas as Pessoas
                CadastroController.getALl(pessoas);
                break;
            case 2:
                CadastroController.comprarIdade(pessoas);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }
}
