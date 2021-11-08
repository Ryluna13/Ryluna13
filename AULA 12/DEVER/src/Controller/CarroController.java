package Controller;

import Model.CarroModel;
import Model.MotoModel;

import java.util.ArrayList;
import java.util.Scanner;

public class CarroController {
    public static void cadastra(ArrayList<CarroModel> carros) {
        Scanner read = new Scanner(System.in);
        CarroModel carro = new CarroModel();


        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Carros  -----");
        System.out.println("--------------------------------");

        System.out.print("Fabricante: ");
        carro.setFabricante(read.next());
        System.out.print("Modelo: ");
        carro.setModelo(read.next());
        System.out.print("Tipo: ");
        carro.setTipo(read.next());

        System.out.print("Preço : ");
        carro.setPreco(read.nextDouble());

        System.out.print("Ano : ");
        carro.setAno(read.nextInt());

        carros.add(carro);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }
    public static void imprime(CarroModel carro) {

        System.out.println("-----------------------------------");
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Preço: " + carro.getPreco());
        System.out.println("Ano: " + carro.getAno());

        System.out.println("-----------------------------------");

    }
    public static void teste(ArrayList<CarroModel> carros){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        System.out.println("--------------------------------");
        System.out.println("------ Teste de Veiculos   -----");
        System.out.println("--------------------------------");

        for(int i = 0 ; i <carros.size(); i++){
            System.out.println("Nº " + (i+1));
            imprime(carros.get(i));
            System.out.println("--------------------------");
        }
        System.out.print("\n\nQual Veiculo deseja escolher? Nº \n\n");
        opcao = read.nextInt() - 1;

        System.out.println("--------------------------");
        imprime(carros.get(opcao));
        System.out.println("--------------------------");

        System.out.println("Deseja Ligar esse Carro? (1)Quero! (2)Nah! ");
        opcao2 = read.nextInt();

        if (opcao2 == 1 ){
            carros.get(opcao2-1).ligaDesliga();
            System.out.println(" O Carro Ligou! ");
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
