package DEVER;

import java.util.Scanner;

public class CasaDever {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoas[] = new Pessoa[20];

        System.out.println(" Quer cadastrar Quantas Pessoas?");
        int qtCadastrados = scan.nextInt();
        System.out.println("ok");

        for( int i = 0 ; i < qtCadastrados; i++ ){
            pessoas[i] = new Pessoa();

            System.out.println("Seu Primeiro Nome: " + "\t");
            String nome = scan.next();
            pessoas[i].nome = nome;

            System.out.println("Sua Idade: " + "\t");
            int idade = scan.nextInt();
            pessoas[i].idade = idade;

            System.out.println("Seu Peso: " + "\t");
            double peso = scan.nextDouble();
            pessoas[i].peso = peso;

            System.out.println("Sua Altura: " + "\t");
            double altura = scan.nextDouble();
            pessoas[i].altura = altura;


        }
        System.out.println("Lista de Funcioanrios");
        for (int i = 0 ; i <qtCadastrados ; i++){
            System.out.println("Cadastrados n*: " +(i +1) + "\t");
            System.out.println("Nome: " + pessoas[i].nome + "\t");
            System.out.println("Idade: " + pessoas[i].idade + "\t");
            System.out.println("Peso: " +pessoas[i].peso + "\t");
            System.out.println("Altura: " +pessoas[i].altura + "\t");
            System.out.println("_________________________________________");


        }



    }
}
class Pessoa {

    String  nome;
    double   peso,altura;
    int     idade;


    /*Pessoa(String nome, int idade,double peso,double altura) {
        this.nome   = nome;
        this.idade  = idade;
        this.peso   = peso;
        this.altura = altura;
    }*/

}