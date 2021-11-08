package Controller;

import Model.MotoModel;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MotoController {
    public static void cadastra(ArrayList<MotoModel> motos) {
        try{
        Scanner read = new Scanner(System.in);
        MotoModel moto = new MotoModel();
        FileWriter arquivo =  new FileWriter("C:\\Users\\Pichau\\Documents\\SaidaJava\\Motos.dat");
        PrintWriter escreve = new PrintWriter(arquivo);


        System.out.printf("--------------------------------");
        System.out.printf("------ Cadastro de Motos   -----");
        System.out.printf("--------------------------------");

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

        for (MotoModel m : motos){
            escreve.printf(motoToString(m));
            System.out.printf("---------------");
        }

        System.out.printf("\nCadastro realizado com sucesso!\n");
        arquivo.close();
        }catch (FileNotFoundException e){
            System.out.println("Arquivo Não Encontrado!");
        }catch(InputMismatchException e){
            System.out.println("Voce Não Colocou Oque Foi Pedido!");
        }
        catch (Exception e){
            System.out.println("O Erro Dessa vez é " + e );
        }
    }

    private static String motoToString(MotoModel m){
        return "Fabricante: " + m.fabricante + "Modelo: " + m.modelo+ "Tipo: "+m.tipo+ "Preço: "+ m.preco +"Ano: " + m.ano;  }

    public static void imprime(MotoModel moto) {

        System.out.printf("-----------------------------------");
        System.out.printf("Fabricante: " + moto.getFabricante());
        System.out.printf("Modelo: " + moto.getModelo());
        System.out.printf("Tipo: " + moto.getTipo());
        System.out.printf("Preço: " + moto.getPreco());
        System.out.printf("Ano: " + moto.getAno());

        System.out.printf("-----------------------------------");

    }
    public static void teste(ArrayList<MotoModel> motos){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        System.out.printf("--------------------------------");
        System.out.printf("------ Teste de Veiculos   -----");
        System.out.printf("--------------------------------");

        for(int i = 0 ; i <motos.size(); i++){
            System.out.printf("Nº " + (i+1));
            imprime(motos.get(i));
            System.out.printf("-----------------------------");
        }
        System.out.print("\n\nQual Veiculo deseja escolher? Nº \n\n");
        opcao = read.nextInt() - 1;

        System.out.printf("-----------------------------");
        imprime(motos.get(opcao));
        System.out.printf("-----------------------------");

        System.out.printf("Deseja Ligar essa Moto? (1)Quero! (2)Nah! ");
        opcao2 = read.nextInt();

        if (opcao2 == 1 ){
            motos.get(opcao2-1).ligaDesliga();
            System.out.printf(" A Moto Ligou! ");
        }

        System.out.printf("Dar um rolé ? (1)Borá (2)Não ");
        opcao3 = read.nextInt();

        if (opcao3 == 1){
                System.out.printf("Vruuuuuummmmmmmmm!");
        }
        else{
            System.out.printf("Vaitimembora!");
        }


    }
    public static void RelatarMoto(ArrayList<MotoModel> motos) {
        try{
            Scanner get = new Scanner(System.in);
            FileReader arquivoLeitura = new FileReader("C:\\Users\\Pichau\\Documents\\SaidaJava\\Motos.dat");
            BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

            String linha;

            while ((linha = leitorArquivo.readLine()) != null ){
                System.out.println(linha);
            }
            System.out.println("\n\n ------ Fim de Arquivo ------\n\n");

            System.out.println("Arquivo o gerado com Sucesso!");
        }catch (FileNotFoundException e){
            System.out.println("Não Encontrou o Arquivo");

        }catch (Exception e){
            System.out.println("Default");
        }
    }

}

