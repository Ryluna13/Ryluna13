package MAIN;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Ola Mundo!");
        System.out.println("Tamo Juntos!");

        // Tipos Primitivos
        char letra = 'a';
        double numero = 17.58;
        float n2 = 15.8f;
        boolean condicao = true;
        int n3 = 71;
        long n4 = 64;
        short n5 = 72;

        String nome = "Juca";
        String sobrenome = "Bala";

        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        double raiz = Math.sqrt(144);
        System.out.println(raiz);
        System.out.println(Math.pow(12,2));

        Scanner leia = new Scanner(System.in);
        System.out.println("Qual o nome?");
        nome =  leia.nextLine();

        System.out.println("Qual a idade?");
        int idade = leia.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade " + idade);
    }
}