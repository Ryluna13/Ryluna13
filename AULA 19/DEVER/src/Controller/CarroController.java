package Controller;

import Model.CarroModel;
import Model.MotoModel;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarroController {
    public static void cadastra(ArrayList<CarroModel> carros) {
        try{
        Scanner read = new Scanner(System.in);
        CarroModel carro = new CarroModel();
        FileWriter arquivo =  new FileWriter("C:\\Users\\Pichau\\Documents\\SaidaJava\\Carros.dat");
        PrintWriter escreve = new PrintWriter(arquivo);


        System.out.printf("--------------------------------");
        System.out.printf("------ Cadastro de Carros  -----");
        System.out.printf("--------------------------------");

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
        for (CarroModel c : carros){
            escreve.println(carroToString(c));
            System.out.println("---------------");
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
    private static String carroToString(CarroModel c){
        return "Fabricante: " + c.fabricante + "Modelo: " + c.modelo+ "Tipo: "+c.tipo+ "Preço: "+ c.preco +"Ano: " + c.ano;
        }

    public static void imprime(CarroModel carro) {

        System.out.printf("-----------------------------------");
        System.out.printf("Fabricante: " + carro.getFabricante());
        System.out.printf("Modelo: " + carro.getModelo());
        System.out.printf("Tipo: " + carro.getTipo());
        System.out.printf("Preço: " + carro.getPreco());
        System.out.printf("Ano: " + carro.getAno());

        System.out.printf("-----------------------------------");

    }
    public static void teste(ArrayList<CarroModel> carros){
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;
        int opcao3 = 0;

        System.out.printf("--------------------------------");
        System.out.printf("------ Teste de Veiculos   -----");
        System.out.printf("--------------------------------");

        for(int i = 0 ; i <carros.size(); i++){
            System.out.printf("Nº " + (i+1));
            imprime(carros.get(i));
            System.out.printf("--------------------------");
        }
        System.out.print("\n\nQual Veiculo deseja escolher? Nº \n\n");
        opcao = read.nextInt() - 1;

        System.out.printf("--------------------------");
        imprime(carros.get(opcao));
        System.out.printf("--------------------------");

        System.out.printf("Deseja Ligar esse Carro? (1)Quero! (2)Nah! ");
        opcao2 = read.nextInt();

        if (opcao2 == 1 ){
            carros.get(opcao2-1).ligaDesliga();
            System.out.printf(" O Carro Ligou! ");
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
    public static void RelatarCarro(ArrayList<CarroModel> carros) {
        try{
            Scanner get = new Scanner(System.in);
            FileReader arquivoLeitura = new FileReader("C:\\Users\\Pichau\\Documents\\SaidaJava\\Carros.dat");
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
