package Aula;

import java.util.Random;

public class Aula {
    public static void main(String[] args) {
        int[] muaArray = new int[4];
        int[][] minhaMatriz = new int[4][4];
        Random sorteia = new Random();

        for (int i = 0; i < muaArray.length; i++) {
            muaArray[i] = sorteia.nextInt(10);
            // para número negativos multipleque por -1 ex: 10*-1
        }

        for (int i = 0; i < muaArray.length; i++) {
            System.out.println(muaArray[i]);
        }
        int[] novoVetor = new int[7];
        System.arraycopy(muaArray, 0, novoVetor, 0, muaArray.length);

        for (int i = 0; i < novoVetor.length; i++) {
            System.out.println(novoVetor[i]);
        }

        String[] vetor = new String[8];
        vetor[1] = "Juca Bala";
        vetor[0] = "Joyce Bala";
        vetor[3] = "Java Bala";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null)
                System.out.println(vetor[i]);
        }
        /*
        preencha o minhaMatriz com numero aleatorios e imprima como abaixo :

        ---------------
          7  8  15 21
          2  7  5  32
          1  4  8  9
          25 30 40 55
         --------------
         */

        for (int i = 0; i < minhaMatriz.length; i++) {
               for (int j = 0; j<minhaMatriz[i].length; j++){
                   minhaMatriz[i][j] = sorteia.nextInt(100);
               }
        }
            System.out.println("------------------");
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j<minhaMatriz[i].length; j++){
                System.out.print(minhaMatriz[i][j] + "\t");
            }
            System.out.println();//encerrei a linha
        }
            System.out.println("------------------");
    }
}
