import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        double nota1,nota2,nota3,nota4,media,total;

        Scanner read = new Scanner(System.in);

        System.out.println("Insira a Nota 1:  ");
        nota1 = read.nextDouble();
        System.out.println("Insira a Nota 2:  ");
        nota2 = read.nextDouble();
        System.out.println("Insira a Nota 3:  ");
        nota3 = read.nextDouble();
        System.out.println("Insira a Nota 4:  ");
        nota4 = read.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;
        total = (nota1+nota2+nota3+nota4);

        System.out.println("O Valor medio das notas são " + media + ".");
        System.out.println("O Valor total das notas são " + total + ".");


    }
}
