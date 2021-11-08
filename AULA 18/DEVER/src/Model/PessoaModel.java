package Model;

import Erros.SenhaFraca;

import java.util.Scanner;

public class PessoaModel {
    public String nome, sexo,senha;
    public int idade;

    public PessoaModel(){};

    public PessoaModel(String nome, String sexo,String senha, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.senha = senha;
    }

    public String getSenha() {
       return senha;
    }

    public void setSenha(String senha) {
        while (0==0){
            if(!TemNumero(senha) ||  !TemChar(senha)) {
                try {
                    throw new SenhaFraca();
                } catch (SenhaFraca senhaFraca) {
                    System.out.println(senhaFraca);

                }
                Scanner get = new Scanner(System.in);
                System.out.println(" - Tente Outra Vez - ");
                senha = get.nextLine();
            }else{
                this.senha = senha;
                break;
            }
    }}
    public static boolean TemNumero(String a){
        for(int i  = 0 ; i < a.length() ; i++){
            if(Character.isDigit(a.charAt(i))){

                return true;
            }
        }   return false;
    }
    public static boolean TemChar(String a){
        for(int i  = 0 ; i < a.length() ; i++){
            if(!Character.isDigit(a.charAt(i)) && !Character.isAlphabetic(a.charAt(i)))
                return true;

        }
        return false;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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

