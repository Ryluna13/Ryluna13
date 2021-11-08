package Controller;

import Model.ClienteModel;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteController {
    public static void cadastra(ArrayList<ClienteModel> Lista ){
        Scanner get = new Scanner(System.in);
        Lista.add(new ClienteModel());
        String nome, genero , cpf;


        System.out.println("\n\n ====== Cadastro de Livro ========");
        System.out.print("Seu Nome : ");
        nome = get.nextLine();
        System.out.print("Genero : ");
        genero = get.nextLine();
        System.out.print("Cpf : ");
        cpf = get.nextLine();


        Lista.add(new ClienteModel(nome,genero,cpf));

    }
    public static void imprime(ArrayList<ClienteModel> Lista ){
        if(Lista.size() == 0){
            System.out.println("\n\n Vazio Irmão");
        }else{
            for(int i = 0 ; i < Lista.size() ; i++ ){
                System.out.println("Nº" + (i+1));
                System.out.println("Nome " + Lista.get(i).getNome());
                System.out.println("Gênero " + Lista.get(i).getGenero());
                System.out.println("Cpf " + Lista.get(i).getCpf());

                System.out.println("======================================");
            }
        }
    }
    public  static void exclui(ArrayList<ClienteModel> Lista){
        if(Lista.isEmpty()){
            System.out.println("\n\n Lista Vazia \n\n");
        }else{
            Scanner get = new Scanner (System.in);
            imprime(Lista);
            System.out.println("Qual Livro Dejesa Exclur? Nº ");
            int index = get.nextInt()-1;

            Lista.remove(index);
            System.out.println("Excluido Com Sucesso!");
        }
    }
}

