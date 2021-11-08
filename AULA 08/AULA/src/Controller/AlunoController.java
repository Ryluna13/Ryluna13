package Controller;

import Model.AlunoModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlunoController {
    public static void cadastra(ArrayList<AlunoModel> Lista ){
        Scanner get = new Scanner(System.in);
        Lista.add(new AlunoModel());
        String nome, genero ;


        System.out.print("Seu Nome : ");
        nome = get.nextLine();
        System.out.print("Genero : ");
        genero = get.nextLine();

        System.out.print("Dia do Aniversário da Pessoa nº1 : ");
        int dia =  get.nextInt();
        System.out.print("Mês do Aniversário da Pessoa nº1 : ");
        int mes =  get.nextInt();
        System.out.print("Ano do Aniversário da Pessoa nº1 : ");
        int ano =  get.nextInt();
        LocalDate data = LocalDate.of(dia,mes,ano);



        Lista.add(new AlunoModel(nome,genero,data));

    }
    public static void imprime(ArrayList<AlunoModel> Lista ){
        if(Lista.size() == 0){
            System.out.println("\n\n Vazio Irmão");
        }else{
            for(int i = 0 ; i < Lista.size() ; i++ ){
                System.out.println("Nº" + (i+1));
                System.out.println("Nome " + Lista.get(i).getNome());
                System.out.println("Gênero " + Lista.get(i).getGenero());


                System.out.println("======================================");
            }
        }
    }
    public  static void exclui(ArrayList<AlunoModel> Lista){
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
