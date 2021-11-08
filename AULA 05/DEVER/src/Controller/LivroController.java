package Controller;

import Model.LivroModel;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroController {
    public static void cadastra(ArrayList<LivroModel> Lista  ){
        Scanner get = new Scanner(System.in);
        Lista.add(new LivroModel());
        String nome, autor , genero;
        double preco;

        System.out.println("\n\n ====== Cadastro de Livro ========");
        System.out.print("Nome do Livro: ");
        nome = get.nextLine();
        System.out.print("Nome do Autor: ");
        autor = get.nextLine();
        System.out.print("Gênero do Livro: ");
        genero = get.nextLine();
        System.out.print("Preço do Livro: ");
        preco = get.nextDouble();

         Lista.add(new LivroModel(nome,autor,genero,preco));


    }
    public static void imprime(ArrayList<LivroModel> Lista ){
        if(Lista.size() == 0){
            System.out.println("\n\n Vazio Irmão");
        }else{
            for(int i = 0 ; i < Lista.size() ; i++ ){
                System.out.println("Nº" + (i+1));
                System.out.println("Nome " + Lista.get(i).getNome());
                System.out.println("Autor " + Lista.get(i).getAutor());
                System.out.println("Gênero " + Lista.get(i).getGenero());
                System.out.println("Preço " + Lista.get(i).getPreco());
                System.out.println("======================================");
            }
        }
    }
    public  static void exclui(ArrayList<LivroModel> Lista){
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
