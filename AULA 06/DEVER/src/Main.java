import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Calendar data1 = Calendar.getInstance();

        System.out.println("--------------------------");
        System.out.println("----Quem é Mais Velho?----");
        System.out.println("--------------------------");

        System.out.println("Dia do Aniversário da Pessoa nº1:");
        int dia1 =  get.nextInt();
        data1.set(Calendar.DAY_OF_MONTH, dia1);
        System.out.println("Mês do Aniversário da Pessoa nº1:");
        int mes1 =  get.nextInt();
        data1.set(Calendar.MONTH, mes1);
        System.out.println("Ano do Aniversário da Pessoa nº1:");
        int ano1 =  get.nextInt();
        data1.set(Calendar.YEAR, ano1);

        Calendar data2 = Calendar.getInstance();

        System.out.println("Dia do Aniversário da Pessoa nº2:");
        int dia2 =  get.nextInt();
        data2.set(Calendar.YEAR, dia2);
        System.out.println("Mês do Aniversário da Pessoa nº2:");
        int mes2 =  get.nextInt();
        data2.set(Calendar.YEAR, mes2);
        System.out.println("Ano do Aniversário da Pessoa nº2:");
        int ano2 =  get.nextInt();
        data2.set(Calendar.YEAR, ano2);

        int opcao = 0 ;

         if (data1.compareTo(data2) == 1)   {

             opcao = 1;
         };
        if (data1.compareTo(data2) == 1)   {

            opcao = 2;
        };
        if (dia1 == dia2 && mes1 == mes2 && ano1 == ano2 )   {
            opcao = 3;

        }
        switch (opcao){
            case 1:
                System.out.println("Pessoa Nº2 é Mais Velha");
                break;
            case 2:
                System.out.println("Pessoa Nº1 é Mais Velha");
                break;
            case 3:
                System.out.println("As Pessoas Tem a mesma Idade!");
                break;
            default:
                System.out.println("Algo De Certo Está Errado");
                break;



        }




    }
}
