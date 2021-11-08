package View;

import Controller.BarcoController;
import Controller.CarroController;
import Controller.MotoController;
import Model.BarcoModel;
import Model.CarroModel;
import Model.MotoModel;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void principal(ArrayList<CarroModel> carros,
                                ArrayList<MotoModel> motos,
                                ArrayList<BarcoModel> barcos) {

        while(0==0){
            try{
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.printf("===================================");
        System.out.printf("=======  Perfil do Veiculo   ======");
        System.out.printf("===================================");
        System.out.printf("(1)Cadastrar");
        System.out.printf("(2)Testar ou Relatar");
        System.out.printf("(0)Sair");
        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){
            case 1://Cadastrar
                cadastrar(carros,motos,barcos);
                break;
            case 2://testar
                testareRelatar(carros,motos,barcos);
                break;


            case 0://sair
                System.exit(1);
                break;

            default:
                System.out.printf("\n\nOpção inválida!\n\n");
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
    public static void cadastrar(ArrayList<CarroModel> carros,
                                 ArrayList<MotoModel> motos,
                                 ArrayList<BarcoModel> barcos){
        try{
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.printf("======= Cadastros =======");
        System.out.printf("(1)Carros");
        System.out.printf("(2)Motos");
        System.out.printf("(3)Barcos");

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
                System.out.printf("\n\nOpção inválida!\n\n");
        }
        }catch (InputMismatchException e){
            System.out.println(" ");
            System.out.println("Apenas os Numeros Mostrados Serão Aceitos!");
            System.out.println(" ");
        }catch (Exception e){
            System.out.println(" ");
            System.out.println("Default");
            System.out.println(" ");
        }
    }
    public static void testareRelatar(ArrayList<CarroModel> carros,
                                 ArrayList<MotoModel> motos,
                                 ArrayList<BarcoModel> barcos){
        try{
        Scanner get = new Scanner(System.in);
        int opcao = 0;

        System.out.printf("======= Cadastros =======");
        System.out.printf("(1)Teste de Carros");
        System.out.printf("(2)Relatar Todos os Carros");
        System.out.printf("(3)Teste de Motos");
        System.out.printf("(4)Relatar Todas as Motos");
        System.out.printf("(5)Tesde de Barcos");
        System.out.printf("(6)Relatar Todos os Barcos");

        System.out.print("Escolha uma opção: ");
        opcao = get.nextInt();

        switch (opcao){

            case 1:// Carro Test
                CarroController.teste(carros);
                break;
            case 2:// Relatar Carro
                CarroController.RelatarCarro(carros);
                break;
            case 3:// Moto Test
                MotoController.teste(motos);
                break;
            case 4:// Relatar Moto
                 MotoController.RelatarMoto(motos);
                 break;
            case 5:// Barco Teste
                BarcoController.teste(barcos);
                break;
            case 6:// Relatar Barco
                 BarcoController.RelatarBarco(barcos);


            default:
                System.out.printf("\n\nOpção inválida!\n\n");
        }
        }catch (InputMismatchException e){
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
