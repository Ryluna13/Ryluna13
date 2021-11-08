package DEVER.Model;


import java.util.Scanner;

public class CadastroModel {
    private String nome;
    private String sexo;
    private int idade;

    public CadastroModel(){}


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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
