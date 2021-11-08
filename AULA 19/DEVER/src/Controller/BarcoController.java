package Controller;

import Model.BarcoModel;
import Model.CarroModel;
import Model.MotoModel;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BarcoController {
    public static void cadastra(ArrayList<BarcoModel> barcos) {
        try{
        Scanner read = new Scanner(System.in);
        BarcoModel barco = new BarcoModel();
            FileWriter arquivo =  new FileWriter("C:\\Users\\Pichau\\Documents\\SaidaJava\\Barcos.dat");
            PrintWriter escreve = new PrintWriter(arquivo);


        System.out.printf("--------------------------------");
        System.out.printf("------ Cadastro de Barcos  -----");
        System.out.printf("--------------------------------");

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

        for (BarcoModel b: barcos){
            escreve.printf(barcoToString(b));
            System.out.printf("---------------");
        }
        System.out.printf("\nCadastro realizado com sucesso!\n");
            arquivo.close();
        }catch (FileNotFoundException e){
            System.out.printf("Arquivo Não Encontrado!");
        }catch(InputMismatchException e){
            System.out.printf("Voce Não Colocou Oque Foi Pedido!");
        }
        catch (Exception e){
            System.out.printf("O Erro Dessa vez é " + e );
        }

    }

    private static String barcoToString(BarcoModel b){
        return "Fabricante: " + b.fabricante + "Modelo: " + b.modelo+ "Tipo: "+b.tipo+ "Preço: "+ b.preco +"Ano: " + b.ano;
    }

    public static void imprime(BarcoModel barco) {

        System.out.printf("-----------------------------------");
        System.out.printf("Fabricante: " + barco.getFabricante());
        System.out.printf("Modelo: " + barco.getModelo());
        System.out.printf("Tipo: " + barco.getTipo());
        System.out.printf("Preço: " + barco.getPreco());
        System.out.printf("Ano: " + barco.getAno());

        System.out.printf("-----------------------------------");

    }
    public static void teste(ArrayList<BarcoModel> barcos){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        System.out.printf("--------------------------------");
        System.out.printf("------ Teste de Veiculos   -----");
        System.out.printf("--------------------------------");

        for(int i = 0 ; i <barcos.size(); i++){
            System.out.printf("Nº " + (i+1));
            imprime(barcos.get(i));
            System.out.printf("-----------------------------");
        }
        System.out.print("\n\nQual Veiculo deseja escolher? Nº \n\n");
        opcao = read.nextInt() - 1;

        System.out.printf("-----------------------------");
        imprime(barcos.get(opcao));
        System.out.printf("-----------------------------");

        System.out.printf("Deseja Ligar esse Barco? (1)Quero! (2)Nah! ");
        opcao2 = read.nextInt();

        if (opcao2 == 1 ){
            barcos.get(opcao2-1).ligaDesliga();
            System.out.printf(" O Barco ligou! ");
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
    public static void RelatarBarco(ArrayList<BarcoModel> barcos) {
        try{
            Scanner get = new Scanner(System.in);
            FileReader arquivoLeitura = new FileReader("C:\\Users\\Pichau\\Documents\\SaidaJava\\Barcos.dat");
            BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

            String linha;

            while ((linha = leitorArquivo.readLine()) != null ){
                System.out.printf(linha);
            }
            System.out.printf("\n\n ------ Fim de Arquivo ------\n\n");

            System.out.printf("Arquivo o gerado com Sucesso!");
        }catch (FileNotFoundException e){
            System.out.printf("Não Encontrou o Arquivo");

        }catch (Exception e){
            System.out.printf("Default");
        }
    }
}
