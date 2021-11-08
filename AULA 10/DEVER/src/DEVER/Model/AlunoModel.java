package DEVER.Model;

import java.time.LocalDate;
import java.util.Scanner;

public class AlunoModel {
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;


    public AlunoModel(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        while(nome.length() == 0){
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nNome inválido!\n\n");
            System.out.print("Novo nome: ");
            nome = get.nextLine();
        }
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        String [] data = new String[1];
        if(dataNascimento.contains("/"))
            data = dataNascimento.split("/");

        if(dataNascimento.contains("-"))
            data = dataNascimento.split("-");


        this.dataNascimento = LocalDate.of(Integer.parseInt(data[2]),
                Integer.parseInt(data[1]),
                Integer.parseInt(data[0]));
    }



}