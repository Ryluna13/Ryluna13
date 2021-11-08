package DEVER.Controller;

import DEVER.Model.AlunoModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class AlunoController {
    public static void cadastra(ArrayList<AlunoModel> alunos) {
        Scanner read = new Scanner(System.in);
        String nome, sexo;
        LocalDate dataNasimento;

        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Alunos ------");
        System.out.println("--------------------------------");

        System.out.println("Nome: ");
        nome = read.nextLine();

        System.out.println("Sexo (menino ou menina): ");
        sexo = read.nextLine();

        System.out.print("Dia do seu nascimento: ");
        int dia = read.nextInt();
        System.out.print("Mês do seu nascimento: ");
        int mes = read.nextInt();
        System.out.print("Ano do seu nascimento: ");
        int ano = read.nextInt();

        dataNasimento = LocalDate.of(ano, mes, dia);

        alunos.add(new AlunoModel(nome, sexo, dataNasimento));
    }

    public static void imprime(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println("Nº " + (i + 1));
                System.out.println("Nome: " + alunos.get(i).getNome());
                System.out.println("Sexo: " + alunos.get(i).getSexo());
                System.out.println("Data de Nascimento: " + alunos.get(i).getDataNascimento());
                System.out.println("-----------------------------------");
            }
        }
    }

    public static void exclui(ArrayList<AlunoModel> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("\n\nSem Alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            Scanner get = new Scanner(System.in);

            imprime(alunos);

            System.out.print("\n\nQual aluno deseja excluir? Nº \n\n");
            int index = get.nextInt() - 1;

            alunos.remove(index);
            System.out.println("\n\nAluno exluído com sucesso!\n\n");
        }
    }
    // Relatório 1 -
    public static void relatarAlunosMaioresDeIdade(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Alunos Maiores de Idade");

            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getDataNascimento().getYear() >= 18) {
                    System.out.println("Nº " + (i + 1));
                    System.out.println("Nome: " + alunos.get(i).getNome());
                    System.out.println("Sexo: " + alunos.get(i).getSexo());
                    System.out.println("Data de Nascimento: " + alunos.get(i).getDataNascimento());
                    System.out.println("-----------------------------------");
                }
            }}}
      // Relatório 2 -
    public static void relataAlunosMenosDeIdade(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Alunos Menores de Idade");

            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getDataNascimento().getYear() < 18) {
                    System.out.println("Nº " + (i + 1));
                    System.out.println("Nome: " + alunos.get(i).getNome());
                    System.out.println("Sexo: " + alunos.get(i).getSexo());
                    System.out.println("Data de Nascimento: " + alunos.get(i).getDataNascimento());
                    System.out.println("-----------------------------------");
                }
            }}}
    public static void relataAlunosMenoresDeIdadeDoSexoMasculino(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            // Relatório 3 -

            System.out.println("Alunos menores de idade do sexo masculino");

            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getDataNascimento().getYear() < 18 && alunos.get(i).getSexo() == "menino") {
                    System.out.println("Nº " + (i + 1));
                    System.out.println("Nome: " + alunos.get(i).getNome());
                    System.out.println("Sexo: " + alunos.get(i).getSexo());
                    System.out.println("Data de Nascimento: " + alunos.get(i).getDataNascimento());
                    System.out.println("-----------------------------------");
                }
            }
        }
            }
    public static void relataAlunosMenoresdeIdadedoSexoFeminino(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            // Relatório 4 -

            System.out.println("Alunos menores de idade do sexo feminino");

            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getDataNascimento().getYear() < 18 && alunos.get(i).getSexo() == "menina") {
                    System.out.println("Nº " + (i + 1));
                    System.out.println("Nome: " + alunos.get(i).getNome());
                    System.out.println("Sexo: " + alunos.get(i).getSexo());
                    System.out.println("Data de Nascimento: " + alunos.get(i).getDataNascimento());
                    System.out.println("-----------------------------------");
                }
            }
        }
    }
          // Relatório 5 -
    public static void relatarAniversarianteDoMes(ArrayList<AlunoModel> alunos) {
        LocalDate hoje = LocalDate.now();

        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
                for (int i = 0; i< alunos.size();  i++){
                    if(alunos.get(i).getDataNascimento().getMonth() == hoje.getMonth()){
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Sexo: " + alunos.get(i).getSexo());
                        System.out.println("Data de Nascimento: " + alunos.get(i).getDataNascimento());
                        System.out.println("-----------------------------------");
                    }
                }
            }
        }
            // Relatório 6 -
    public static void relatarMasculinoMaisVelho(ArrayList<AlunoModel> alunos) {
        AlunoModel maisVelho = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Aluno Masculino Mais Velho");

            for (int i = 0;i <alunos.size(); i++){
                if (alunos.get(i).getSexo().equals("menino")){
                    if(maisVelho.getDataNascimento() == null){
                        maisVelho = alunos.get(i);
                    }
                    else {
                        if (maisVelho.getDataNascimento().isAfter((alunos.get(i+1).getDataNascimento()))){
                            maisVelho = alunos.get(i);
                        }
                    }
                }

            }
            if (maisVelho.getDataNascimento() != null){
                System.out.println("Nome: " + maisVelho.getNome());
                System.out.println("Sexo: " + maisVelho.getSexo());
                System.out.println("Data de Nascimento: " + maisVelho.getDataNascimento());
                System.out.println("-----------------------------------");
            }
        }
    }
         // Relatório 7 -
    public static void relatarMasculinoMaisNovo(ArrayList<AlunoModel> alunos) {
        AlunoModel maisNovo = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Aluno Masculino Mais Novo");

            for (int i = 0;i <alunos.size(); i++){
                if (alunos.get(i).getSexo().equals("menino")){
                    if(maisNovo.getDataNascimento() == null){
                        maisNovo = alunos.get(i);
                    }
                    else {
                        if (maisNovo.getDataNascimento().isBefore(alunos.get(i+1).getDataNascimento())){
                            maisNovo = alunos.get(i);
                        }
                    }
                }

            }
            if (maisNovo.getDataNascimento() != null){
                System.out.println("Nome: " + maisNovo.getNome());
                System.out.println("Sexo: " + maisNovo.getSexo());
                System.out.println("Data de Nascimento: " + maisNovo.getDataNascimento());
                System.out.println("-----------------------------------");
            }
        }
    }
         // Relatório 8 -
    public static void relatarFemininoMaisVelha(ArrayList<AlunoModel> alunos) {
        AlunoModel maisVelha = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Aluno Feminina Mais Velha");

            for (int i = 0;i <alunos.size(); i++){
                if (alunos.get(i).getSexo().equals("menina")){
                    if(maisVelha.getDataNascimento() == null){
                        maisVelha = alunos.get(i);
                    }
                    else {
                        if (maisVelha.getDataNascimento().isAfter((alunos.get(i+1).getDataNascimento()))){
                            maisVelha = alunos.get(i);
                        }
                    }
                }

            }
            if (maisVelha.getDataNascimento() != null){
                System.out.println("Nome: " + maisVelha.getNome());
                System.out.println("Sexo: " + maisVelha.getSexo());
                System.out.println("Data de Nascimento: " + maisVelha.getDataNascimento());
                System.out.println("-----------------------------------");
            }
        }
    }
         // Relatório 9 -
    public static void relatarFemininaMaisNova(ArrayList<AlunoModel> alunos) {
        AlunoModel maisNova = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Aluno Feminina Mais Nova");

            for (int i = 0;i <alunos.size(); i++){
                if (alunos.get(i).getSexo().equals("menina")){
                    if(maisNova.getDataNascimento() == null){
                        maisNova = alunos.get(i);
                    }
                    else {
                        if (maisNova.getDataNascimento().isBefore(alunos.get(i+1).getDataNascimento())){
                            maisNova = alunos.get(i);
                        }
                    }
                }

            } if (maisNova.getDataNascimento() != null){
                System.out.println("Nome: " + maisNova.getNome());
                System.out.println("Sexo: " + maisNova.getSexo());
                System.out.println("Data de Nascimento: " + maisNova.getDataNascimento());
                System.out.println("-----------------------------------");
            }
        }
    }

}

