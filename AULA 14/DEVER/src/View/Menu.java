package View;

import Controller.FrutaController;
import Model.FrutaModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void inicio(ArrayList<FrutaModel> frutas) throws IOException {
        while(0==0){
            Scanner get = new Scanner(System.in);
            int opcao = 0;

            System.out.println("===================================");
            System.out.println("=======  Criação De Frutas   ======");
            System.out.println("===================================");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Relatórios");
            System.out.println("(0)Sair");
            System.out.print("Escolha uma opção: ");
            opcao = get.nextInt();

            switch (opcao){
                case 1://Cadastrar
                    cadastrar(frutas);
                    break;
                case 2: //relatórios
                    relatar(frutas);
                    break;

                case 0://sair
                    System.exit(1);
                    break;

                default:
                    System.out.println("\n\nOpção inválida!\n\n");
            }
        }

    }
    public static void cadastrar(ArrayList<FrutaModel> frutas) throws IOException {

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Cadastros =======");
        System.out.println("(1)Fruta");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1://Aluno
                FrutaController.cadastra(frutas);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }
    public static void relatar(ArrayList<FrutaModel> frutas) throws IOException {
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Relatórios =======");
        System.out.println("(1) Todas Frutas no Txt");
        System.out.println("(2) Ler o Arquivo TxT");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao) {

            case 1:
                FrutaController.RelatarTxt(frutas);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }


}
