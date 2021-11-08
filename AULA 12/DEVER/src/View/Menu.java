package View;

import Controller.BarcoController;
import Controller.CarroController;
import Controller.MotoController;
import Model.BarcoModel;
import Model.CarroModel;
import Model.MotoModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<CarroModel> carros,
                                ArrayList<MotoModel> motos,
                                ArrayList<BarcoModel> barcos) {

        while(0==0){
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("===================================");
        System.out.println("=======  Perfil do Veiculo   ======");
        System.out.println("===================================");
        System.out.println("(1)Cadastrar");
        System.out.println("(2)Testar");
        System.out.println("(0)Sair");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){
            case 1://Cadastrar
                cadastrar(carros,motos,barcos);
                break;
            case 2://testar
                testar(carros,motos,barcos);
                break;


            case 0://sair
                System.exit(1);
                break;

            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
        }
    }
    public static void cadastrar(ArrayList<CarroModel> carros,
                                 ArrayList<MotoModel> motos,
                                 ArrayList<BarcoModel> barcos){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Cadastros =======");
        System.out.println("(1)Carros");
        System.out.println("(2)Motos");
        System.out.println("(3)Barcos");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1://Aluno
                CarroController.cadastra(carros);
                break;
            case 2://Aluno
                MotoController.cadastra(motos);
                break;
            case 3://Aluno
                BarcoController.cadastra(barcos);
                break;


            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }
    public static void testar(ArrayList<CarroModel> carros,
                                 ArrayList<MotoModel> motos,
                                 ArrayList<BarcoModel> barcos){

        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.println("======= Cadastros =======");
        System.out.println("(1)Carros");
        System.out.println("(2)Motos");
        System.out.println("(3)Barcos");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1://Aluno
                CarroController.teste(carros);
                break;
            case 2://Aluno
                MotoController.teste(motos);
                break;
            case 3://Aluno
                BarcoController.teste(barcos);
                break;


            default:
                System.out.println("\n\nOpção inválida!\n\n");
        }
    }

}
