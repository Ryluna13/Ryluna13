package View;

import Controller.PessoaController;
import Model.PessoaModel;


import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    public static void inicio(ArrayList<PessoaModel> pessoas)  {

        while(0==0){
            try{

            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("===================================");
            System.out.println("=======  Criação De Perfil   ======");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Relatórios");
            System.out.println("(0)Sair");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastrar(pessoas);
                    break;
                case 2: //relatórios
                    relatar(pessoas);
                    break;

                case 0://sair
                    System.exit(1);
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("\n\nOpção inválida!\n\n");
                    System.out.println(" ");
                    break;
            }
            }catch (WrongMethodTypeException e){
                System.out.println(" ");
                System.out.println("Apenas os Numeros Mostrados Serão Aceitos!");
                System.out.println(" ");
            }catch (Exception e){
                System.out.println(" ");
                System.out.println("Default");
                System.out.println(" ");
            }
        }
    }

    public static void cadastrar (ArrayList<PessoaModel> pessoas){
            try{
            Scanner get = new Scanner(System.in);

            int opcao = 0;

            System.out.println("======= Cadastros =======");
            System.out.println("(1)Pessoa");

            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao) {

                case 1://Aluno
                    PessoaController.cadastra(pessoas);
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
                    break;
            }}catch (InputMismatchException e){
                System.out.println(" ");
                System.out.println("Apenas os Numeros Mostrados Serão Aceitos!");
                System.out.println(" ");
            }catch (Exception e){
                System.out.println(" ");
                System.out.println("Default");
                System.out.println(" ");
            }

        }
        public static void relatar (ArrayList<PessoaModel>  pessoas)  {
            try{
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("======= Relatórios =======");
            System.out.println("(1) Ler o Arquivo");


            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao) {

                case 1:
                    PessoaController.Relatar(pessoas);
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
                    break;
            }}catch (InputMismatchException e){
                System.out.println(" ");
                System.out.println("Apenas os Numeros Mostrados Serão Aceitos!");
                System.out.println(" ");
            }catch (Exception e){
                System.out.println(" ");
                System.out.println("Default");
                System.out.println(" ");
           }
        }

    }

