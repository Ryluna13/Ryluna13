package M;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);


        System.out.println("-------------------------------");
        System.out.println("-------------------------------");



        System.out.print("Dia do Aniversário da Pessoa nº1 : ");
        int dia1 =  get.nextInt();
        System.out.print("Mês do Aniversário da Pessoa nº1 : ");
        int mes1 =  get.nextInt();
        System.out.print("Ano do Aniversário da Pessoa nº1 : ");
        int ano1 =  get.nextInt();
        LocalDate data1 = LocalDate.of(ano1,mes1,dia1);

        System.out.print("Dia do Aniversário da Pessoa nº2 : ");
        int dia2 =  get.nextInt();
        System.out.print("Mês do Aniversário da Pessoa nº2 : ");
        int mes2 =  get.nextInt();
        System.out.print("Ano do Aniversário da Pessoa nº2 : ");
        int ano2 =  get.nextInt();
        LocalDate data2 = LocalDate.of(ano2,mes2,dia2);
        System.out.println("-------------------------------");
        // Imprimindo a Data Anterior
        System.out.println("Qual das Data é menos recente?");
        if(data1.isBefore(data2) ){
            System.out.println("A Data Mais Anterior é : " + data1);
        }else if(data2.isBefore(data1) ){
            System.out.println("A Data Mais Anterior é : " + data2);
        }else {
            System.out.println("As Datas São Iguais");
        }
        System.out.println("-------------------------------");
        // Imrpimindo a diferença entra as duas Datas.


        if(data2.isBefore(data1) ){
            Period difData = Period.between(data2,data1);
            System.out.println("A Diferença entre as datas è de : "
                    + difData.getYears() + " Anos "
                    + difData.getMonths() +" Meses "
                    + difData.getDays() + " Dias");
        }else if (data1.isBefore(data2) ){
            Period difData = Period.between(data1,data2);
            System.out.println("A Diferença entre as datas è de : "
                    + difData.getYears() + " Anos "
                    + difData.getMonths() +" Meses "
                    + difData.getDays() + " 0," +
                    "Dias");
        }else{
            System.out.println("As Datas São Iguais");
        }

        System.out.println("-------------------------------");
        // Datas Acrecentadas em 3 semanas.

        System.out.println(data1.plusWeeks(3));
        System.out.println(data2.plusWeeks(3));
        System.out.println("-------------------------------");

        // Diferença em Dias entre uma Data e outra.

        if(data2.isBefore(data1) ){
            long difDatadias = ChronoUnit.DAYS.between(data2,data1);
            System.out.println("Qual a diferença entre as Datas ?");
            System.out.println("A Diferença entre as Datas são " + difDatadias + " dias");

        }else if (data1.isBefore(data2)){
            long difDatadias = ChronoUnit.DAYS.between(data1,data2);
            System.out.println("Qual a diferença entre as Datas ?");
            System.out.println("A Diferença entre as Datas são " + difDatadias + " dias");

        }else{
            System.out.println("As Datas São Iguais");
        }

    }
}
