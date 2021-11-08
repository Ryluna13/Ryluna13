package Main;

import java.util.Scanner;
import java.sql.SQLOutput;


public class Servico {

    private static int qtdLivroCadastrado = 0;

    public static void main(Livro[] livros) {
        while(0==0){
            Scanner get = new Scanner(System.in);


            System.out.println("======== Biblioteca ==========");
            System.out.println("(1)Cadastrar");
            System.out.println("(2)Imprimir");
            System.out.println("(3)## SAIR ##");
            System.out.print("Escolha uma opção acima: ");
            int opcao = get.nextInt();

            switch(opcao){
                case 1://cadastar
                    cadastraLivro(livros);
                    break;

                case 2://Consultar
                    imprimeLivros(livros);
                    break;

                case 3://sair
                    System.exit(0);
                    break;

                default://errrrou
                    System.out.println("\nErrou! \nTente de novo!");
                    break;
            }
        }

    }//Fim Do Menu
    private static void cadastraLivro(Livro [] livros){
        if(qtdLivroCadastrado != livros.length) {

            Scanner get = new Scanner(System.in);
            livros[qtdLivroCadastrado] = new Livro();

            System.out.println("Cadastrar livro:");

            System.out.print("Nome: ");
            livros[qtdLivroCadastrado].setNome(get.nextLine());

            System.out.print("Fabricante: ");
            livros[qtdLivroCadastrado].setAutor(get.nextLine());

            System.out.print("Genero: ");
            livros[qtdLivroCadastrado].setGenero(get.nextLine());

            System.out.print("Preço: ");
            livros[qtdLivroCadastrado].setPreco(get.nextFloat());

            qtdLivroCadastrado++;
        }else{
            System.out.println("\nEstoque lotado! Não é possível cadastrar.\n\n");
        }

    }//  Fim CadastraLivro

    private static void imprimeLivros(Livro[] lista){
        System.out.println("\nCarros cadastrados:\n");

        for(int i = 0 ; i < lista.length ; i++){
            if(lista[i] != null){
                lista[i].imprime();
                System.out.println("======================");
            }else{
                break;
            }
        }
    }//FIM IMPRIMELIVRO

}
