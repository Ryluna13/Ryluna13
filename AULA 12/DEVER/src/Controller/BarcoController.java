package Controller;

import Model.BarcoModel;
import Model.CarroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class BarcoController {
    public static void cadastra(ArrayList<BarcoModel> barcos) {
        Scanner read = new Scanner(System.in);
        BarcoModel barco = new BarcoModel();


        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Barcos  -----");
        System.out.println("--------------------------------");

        System.out.print("Fabricante: ");
        barco.setFabricante(read.next());
        System.out.print("Modelo: ");
        barco.setModelo(read.next());
        System.out.print("Tipo: ");
        barco.setTipo(read.next());

        System.out.print("Preço : ");
        barco.setPreco(read.nextDouble());

        System.out.print("Ano : ");
        barco.setAno(read.nextInt());

        barcos.add(barco);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }
    public static void imprime(BarcoModel barco) {

        System.out.println("-----------------------------------");
        System.out.println("Fabricante: " + barco.getFabricante());
        System.out.println("Modelo: " + barco.getModelo());
        System.out.println("Tipo: " + barco.getTipo());
        System.out.println("Preço: " + barco.getPreco());
        System.out.println("Ano: " + barco.getAno());

        System.out.println("-----------------------------------");

    }
    public static void teste(ArrayList<BarcoModel> barcos){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        System.out.println("--------------------------------");
        System.out.println("------ Teste de Veiculos   -----");
        System.out.println("--------------------------------");

        for(int i = 0 ; i <barcos.size(); i++){
            System.out.println("Nº " + (i+1));
            imprime(barcos.get(i));
            System.out.println("-----------------------------");
        }
        System.out.print("\n\nQual Veiculo deseja escolher? Nº \n\n");
        opcao = read.nextInt() - 1;

        System.out.println("-----------------------------");
        imprime(barcos.get(opcao));
        System.out.println("-----------------------------");

        System.out.println("Deseja Ligar esse Barco? (1)Quero! (2)Nah! ");
        opcao2 = read.nextInt();

        if (opcao2 == 1 ){
            barcos.get(opcao2-1).ligaDesliga();
            System.out.println(" O Barco ligou! ");
        }

        System.out.println("Dar um rolé ? (1)Borá (2)Não ");
        opcao3 = read.nextInt();

        if (opcao3 == 1){
            System.out.println("Vruuuuuummmmmmmmm!");
        }
        else{
            System.out.println("Vaitimembora!");
        }


    }
}
