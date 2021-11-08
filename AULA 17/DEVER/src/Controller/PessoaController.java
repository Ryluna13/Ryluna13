package Controller;

import Model.PessoaModel;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaController {
    public static void cadastra(ArrayList<PessoaModel> pessoas){
        try{
        Scanner get = new Scanner(System.in);
        PessoaModel pessoa = new PessoaModel();
        FileWriter arquivo =  new FileWriter("C:\\Users\\Pichau\\Documents\\SaidaJava\\Pessoa.dat");
        PrintWriter escreve = new PrintWriter(arquivo);

        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Pessoas -----");
        System.out.println("--------------------------------");

        System.out.println(" ");
        System.out.print("Nome: ");
        pessoa.setNome(get.nextLine());

        System.out.print("Sexo: ");
        pessoa.setSexo(get.nextLine());

        System.out.print("Idade: ");
        pessoa.setIdade(get.nextInt());
        System.out.println(" ");

        pessoas.add(pessoa);

        for (PessoaModel p : pessoas){
              escreve.println(pessoaToString(p));
              System.out.println("---------------");
        }

        System.out.println("\nPessoa cadastrado com sucesso!\n");
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

    private static String pessoaToString(PessoaModel p ){
        return "Nome: " + p.nome + " - Sexo: " + p.sexo + " - Idade: " + p.idade;
    }
    public static void imprime(PessoaModel pessoa) {

        System.out.println("-----------------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());

    }

    public static void Relatar(ArrayList<PessoaModel> pessoas) {
        try{
        Scanner get = new Scanner(System.in);
        FileReader arquivoLeitura = new FileReader("C:\\Users\\Pichau\\Documents\\SaidaJava\\Pessoa.dat");
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




