package Model;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class AlunoModel {
    private String nome, genero;
    private LocalDate data ;

    public  AlunoModel(){

    }

    public AlunoModel(String nome,
                        String genero,
                        LocalDate data
                        ) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setData(data);


    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        while (nome.length() == 0) {
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um nome.");
            System.out.print("Novo nome: ");
            nome = get.nextLine();
        }
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        while (genero.length() == 0) {
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um gênero.");
            System.out.print("Novo gênero: ");
            genero = get.nextLine();
        }
        this.genero = genero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData() {

            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar uma Data de Aniversário.");
            System.out.print("Dia do Aniversário do Aluno : ");
            int dia =  get.nextInt();
            System.out.print("Mês do Aniversário do Aluno  : ");
            int mes =  get.nextInt();
            System.out.print("Ano do Aniversário do Aluno  : ");
            int ano =  get.nextInt();
            LocalDate data = LocalDate.of(dia,mes,ano);

    }
}
