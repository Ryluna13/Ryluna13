package Controller;

import Model.CarroModel;
import Model.MotoModel;

import java.util.ArrayList;
import java.util.Scanner;

public class MotoController {
    public static void cadastra(ArrayList<MotoModel> motos) {
        Scanner read = new Scanner(System.in);
        MotoModel moto = new MotoModel();


        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Motos   -----");
        System.out.println("--------------------------------");

        System.out.print("Fabricante: ");
        moto.setFabricante(read.next());

        System.out.print("Modelo: ");
        moto.setModelo(read.next());

        System.out.print("Tipo: ");
        moto.setTipo(read.next());

        System.out.print("Preço : ");
        moto.setPreco(read.nextDouble());

        System.out.print("Ano : ");
        moto.setAno(read.nextInt());

        motos.add(moto);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }

    public static void imprime(MotoModel moto) {

        System.out.println("-----------------------------------");
        System.out.println("Fabricante: " + moto.getFabricante());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Tipo: " + moto.getTipo());
        System.out.println("Preço: " + moto.getPreco());
        System.out.println("Ano: " + moto.getAno());

        System.out.println("-----------------------------------");

    }
    public static void teste(ArrayList<MotoModel> motos){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        System.out.println("--------------------------------");
        System.out.println("------ Teste de Veiculos   -----");
        System.out.println("--------------------------------");

        for(int i = 0 ; i <motos.size(); i++){
            System.out.println("Nº " + (i+1));
            imprime(motos.get(i));
            System.out.println("-----------------------------");
        }
        System.out.print("\n\nQual Veiculo deseja escolher? Nº \n\n");
        opcao = read.nextInt() - 1;

        System.out.println("-----------------------------");
        imprime(motos.get(opcao));
        System.out.println("-----------------------------");

        System.out.println("Deseja Ligar essa Moto? (1)Quero! (2)Nah! ");
        opcao2 = read.nextInt();

        if (opcao2 == 1 ){
            motos.get(opcao2-1).ligaDesliga();
            System.out.println(" A Moto Ligou! ");
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
