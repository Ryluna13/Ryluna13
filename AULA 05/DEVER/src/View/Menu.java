package View;

import Controller.LivroController;
import Controller.FuncionarioController;
import Controller.ClienteController;
import Model.ClienteModel;
import Model.FuncionarioModel;
import Model.LivroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void principal(ArrayList<LivroModel> Livros,
                                 ArrayList<FuncionarioModel> Funcionarios,
                                 ArrayList<ClienteModel> Clientes){
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
                   cadastra(Livros,Funcionarios,Clientes);
                   break;

               case 2://Consultar
                   imprime(Livros,Funcionarios,Clientes);
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

    public static void cadastra(ArrayList<LivroModel> Livros,
                                ArrayList<FuncionarioModel> Funcionarios,
                                ArrayList<ClienteModel> Clientes){


        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("================ Cadastro =================");
        System.out.println("(1)Livro");
        System.out.println("(2)Funcionario");
        System.out.println("(3)Cliente");
        System.out.print("Escolha uma opção acima: ");
        opcao = get.nextInt();

        switch(opcao){
            case 1://Livro
                LivroController.cadastra(Livros);
                break;
            case 2://Funcionario
                FuncionarioController.cadastra(Funcionarios);
                break;
            case 3://Cliente
                ClienteController.cadastra(Clientes);
                break;


            default:
                System.out.println("\n\n Opção Inválida\n\n");
        }
    }//fim cadastra
    public static void imprime(ArrayList<LivroModel> Livros,
                               ArrayList<FuncionarioModel> Funcionarios,
                               ArrayList<ClienteModel> Clientes) {
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("================ Imprime =================");
        System.out.println("(1)Livro");
        System.out.println("(2)Funcionario");
        System.out.println("(3)Cliente");
        System.out.print("Escolha uma opção acima: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                LivroController.imprime(Livros);
                break;
            case 2://Funcionario
                FuncionarioController.imprime(Funcionarios);
                break;
            case 3://Cliente
                ClienteController.imprime(Clientes);
                break;


            default:
                System.out.println("\n\n Opção Inválida\n\n");
        }
    }
    public static void exclui (ArrayList<LivroModel> Livros,
                               ArrayList<FuncionarioModel> Funcionarios,
                               ArrayList<ClienteModel> Clientes) {
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("================ Exclusão =================");
        System.out.println("(1)Livro");
        System.out.println("(2)Funcionario");
        System.out.println("(3)Cliente");
        System.out.print("Escolha uma opção acima: ");
        opcao = get.nextInt();

        switch (opcao) {
            case 1://Livro
                LivroController.exclui(Livros);
                break;
            case 2://Funcionario
                FuncionarioController.imprime(Funcionarios);
                break;
            case 3://Cliente
                ClienteController.imprime(Clientes);
                break;


            default:
                System.out.println("\n\n Opção Inválida\n\n");
        }
    }
}

