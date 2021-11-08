package DEVER.Controller;

import DEVER.Model.CadastroModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CadastroController {
    public static void cadastra(ArrayList<CadastroModel> pessoas) {
        Scanner read = new Scanner(System.in);
        CadastroModel pessoa = new CadastroModel();


        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Pessoas -----");
        System.out.println("--------------------------------");

        System.out.print("Nome: ");
        pessoa.setNome(read.next());

        System.out.print("Sexo (menino ou menina): ");
        pessoa.setSexo(read.next());

        System.out.println("Sua Idade :");
        pessoa.setIdade(read.nextInt());

        pessoas.add(pessoa);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }

    public static void imprime(CadastroModel pessoa) {

        System.out.println("-----------------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("-----------------------------------");



    }

    public static void exclui(ArrayList<CadastroModel> pessoas) {
        if (pessoas.isEmpty()) {
            System.out.println("\n\nSem Pessoas cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            for(int i = 0 ; i <pessoas.size(); i++){
                Scanner get = new Scanner(System.in);

                imprime(pessoas.get(i));

                System.out.print("\n\nQual Pessoa deseja excluir? Nº \n\n");
                int index = get.nextInt() - 1;

                pessoas.remove(index);
                System.out.println("\n\nPessoa exluído com sucesso!\n\n");
            }
        }
    }
    // Relátorio 1
    public static void getALl(ArrayList<CadastroModel> pessoas){
        System.out.println("----------- Relátorio Geral -------------");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Nº " + (i+1));
            imprime(pessoas.get(i));
            System.out.println("------------------------------------");
        }
    }
    /// Relatorio 2
    public static void  comprarIdade(ArrayList<CadastroModel> pessoas){
        Collections.sort(pessoas,new AgeCompararator());
        for(CadastroModel Aluno1 : pessoas){
            imprime(Aluno1);
        }}
    }


class AgeCompararator implements Comparator<CadastroModel>{
    public int compare(CadastroModel pessoa1, CadastroModel pessoa2){
        if(pessoa1.getIdade()==pessoa2.getIdade())
            return 0;
            else if (pessoa1.getIdade()>pessoa2.getIdade())
                return 1;
            else
                return -1;
    }


}
