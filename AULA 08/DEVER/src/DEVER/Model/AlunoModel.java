package DEVER.Model;

import java.time.LocalDate;
import java.util.Scanner;

public class AlunoModel {
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;

    public AlunoModel(){}

    public AlunoModel(
            String nome,
            String sexo,
            LocalDate dataNascimento
    ){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
    }

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

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}