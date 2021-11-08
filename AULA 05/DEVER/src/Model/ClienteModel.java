package Model;

import java.util.Scanner;

public class ClienteModel {
    private String nome, genero, cpf;

    public  ClienteModel(){

    }

    public ClienteModel(String nome,
                        String genero,
                        String cpf) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setCpf(cpf);


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
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        while (cpf.length() == 0) {
            Scanner get = new Scanner(System.in);
            System.out.println("\n\nPrecisa digitar um Cpf.");
            System.out.print("Novo Cpf: ");
            cpf = get.nextLine();
        }
        this.cpf = cpf;
    }
}

