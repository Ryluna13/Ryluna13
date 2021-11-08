package Main;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Calendar data = new GregorianCalendar(2001,11,15);
        data.set(2021,Calendar.DECEMBER,25);
        data.set(2021,11,25);
        Date dataPrint = data.getTime();

        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data Formatada " + formataData.format(dataPrint));

        DateFormat formataHora = DateFormat.getTimeInstance();
        System.out.println("Hora Fomatada " + formataHora.format(dataPrint));

        DateFormat formataDataHora = DateFormat.getDateTimeInstance();
        System.out.println("Tempo Formatado " + formataDataHora.format(dataPrint));

        formataData = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data Longa: " + formataData.format(dataPrint));
        formataData = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data Média: " + formataData.format(dataPrint));
        formataData = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data Curta: " + formataData.format(dataPrint));

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Dia Personalizado:" + formatador.format(dataPrint));
        formatador = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Dia Personalizado:" + formatador.format(dataPrint));

        Locale brasil = new Locale("pt","BR");
        Locale usa = Locale.US;//EUA
        Locale romenia = Locale.ITALIAN;

        formataData = DateFormat.getDateInstance(DateFormat.FULL, usa);
        System.out.println("Data Americana: " + formataData.format(dataPrint));

        LocalDate data1 = LocalDate.of(2021,11,25);
        LocalDate data2 = LocalDate.of(2021,8,20);

        System.out.println(data1.isAfter(data2));
        System.out.println(data1.isBefore(data2));
        System.out.println(data1.isEqual(data2));

        Period periodo = Period.between(data2, data1);
        System.out.println(" Até o Natal: " + periodo.getMonths()+ " meses e " + periodo.getDays() + (" dias"));

    }
}
