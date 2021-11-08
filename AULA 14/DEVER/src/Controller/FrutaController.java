package Controller;

import Model.FrutaModel;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FrutaController {
    public static void cadastra(ArrayList<FrutaModel> frutas) throws IOException {
        Scanner get = new Scanner(System.in);
        FrutaModel fruta = new FrutaModel();



        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Frutas  -----");
        System.out.println("--------------------------------");


        System.out.print("Nome: ");
        fruta.setNome(get.nextLine());

        System.out.print("Preço: ");
        fruta.setPreco(get.nextDouble());

        frutas.add(fruta);

        System.out.println("\nPessoa cadastrado com sucesso!\n");
    }
    public static void imprime(FrutaModel fruta) {

        System.out.println("-----------------------------------");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: " + fruta.getPreco());

    }
    public static void exlcui(FrutaModel frutas){

    }

    // Relátorio 1
    public static void RelatarTxt(ArrayList<FrutaModel> frutas)  throws IOException {
        System.out.println(" Lista De Frutas no Arquivo Txt");
        Scanner get = new Scanner(System.in);
        FileWriter arquivo =  new FileWriter("C:\\Users\\Pichau\\Documents\\SaidaJava\\Hortifruti(Dever15).txt");
        PrintWriter escreveArquivo = new PrintWriter(arquivo);

        escreveArquivo.println(" ---- Lista das Frutas ----");
        escreveArquivo.println(" ");

        for (int i = 0 ; i <frutas.size();i++){
            escreveArquivo.println("N° " + (i+1));
            escreveArquivo.println("Nome: " + frutas.get(i).getNome());
            escreveArquivo.println("Preço: " +frutas.get(i).getPreco());
            escreveArquivo.println("-----------------------");
        }
        arquivo.close();
        System.out.println("Leitura do Arquivo ");

        FileReader arquivoLeitura = new FileReader("C:\\Users\\Pichau\\Documents\\SaidaJava\\Hortifruti(Dever15).txt");
        BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

        String linha;

        while ((linha = leitorArquivo.readLine()) != null ){
            System.out.println(linha);
        }
        System.out.println("\n\n ------ Fim de Arquivo ------\n\n");

        System.out.println("Arquivo o gerado com Sucesso!");

    }
    // Relatorio 2
    public static void RelatarArquivo(ArrayList<FrutaModel> frutas ) throws IOException {


    }
}
