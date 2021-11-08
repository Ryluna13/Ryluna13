package DEVER;

import java.util.Random;

public class CasaDever {
    public static void main(String[] args) {
       // Váriasveis
        int[][] minhaMatriz = new int[6][6];
        int[][] diagonal = new int [6][6];
        int percorrerMatriz = 0;
        Random sorteia = new Random();

       // Enchar a Matriz
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j<minhaMatriz[i].length; j++){
                minhaMatriz[i][j] = sorteia.nextInt(100)+1;
            }
        }
       //   Imprime a Matriz
        System.out.println("------------------");
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j<minhaMatriz[i].length; j++){
                System.out.print(minhaMatriz[i][j] + "\t");
            }
            System.out.println();//encerrei a linha
        }
        System.out.println(" ");
        // Diagonal Princiapl
        System.out.println("Números da Diagonal Princiapl :");
        for ( int i = 0 ; i < minhaMatriz.length ; i++) {
            diagonal[i][i] = minhaMatriz [i][i];
            System.out.print( minhaMatriz [i][i] + " ");
        }
        System.out.println(" ");
        // Diagonal Secundaria
        System.out.println("Números da Diagonal Secundaria :");

        int l = minhaMatriz.length;

        for ( int i = 0 ; i < minhaMatriz.length ; i++) {
            System.out.print( minhaMatriz [l-1][i] + " ");
            diagonal[l-1][i] = minhaMatriz [l-1][i];
            l--;
        }
        System.out.println(" ");
        System.out.println("_____________________________________ ");

        // Desafio de Desenhar ambas Diagonais.
        System.out.println("Desafio");

        for ( int i = 0 ; i < diagonal.length ; i++){
            for (int j = 0 ; j < diagonal[i].length; j++){
                if (diagonal[i][j] !=0){
                    System.out.print(diagonal[i][j] + "\t");
                }else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }


    }
}
