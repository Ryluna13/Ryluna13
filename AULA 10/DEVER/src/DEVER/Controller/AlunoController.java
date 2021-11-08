package DEVER.Controller;

import DEVER.Model.AlunoModel;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoController {
    public static void cadastra(ArrayList<AlunoModel> alunos) {
        Scanner read = new Scanner(System.in);
        AlunoModel aluno = new AlunoModel();


        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Alunos ------");
        System.out.println("--------------------------------");

        System.out.print("Nome: ");
        aluno.setNome(read.next());

        System.out.print("Sexo (menino ou menina): ");
        aluno.setSexo(read.next());

        System.out.print("Data de Nascimento (dia/mês/ano): ");
        aluno.setDataNascimento(read.next());

        alunos.add(aluno);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }

    public static void imprime(AlunoModel aluno) {

            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Sexo: " + aluno.getSexo());
            System.out.println("Nascimento: " + formatar.format(aluno.getDataNascimento()));


    }

    public static void exclui(ArrayList<AlunoModel> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("\n\nSem Alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            for(int i = 0 ; i <alunos.size(); i++){
            Scanner get = new Scanner(System.in);

            imprime(alunos.get(i));

            System.out.print("\n\nQual aluno deseja excluir? Nº \n\n");
            int index = get.nextInt() - 1;

            alunos.remove(index);
            System.out.println("\n\nAluno exluído com sucesso!\n\n");
        }
        }
    }
    // Relátorio 1
    public static void getALl(ArrayList<AlunoModel> alunos){
        System.out.println("----------- Relátorio Geral -------------");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Nº " + (i+1));
            imprime(alunos.get(i));
            System.out.println("------------------------------------");
        }
    }


    // Relatório 2 -
    public static void relatarAlunosMaioresDeIdade(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {


            System.out.println("Alunos Maiores de Idade");

            for (int i = 0; i < alunos.size(); i++) {
                Period periodo = Period.between(alunos.get(i).getDataNascimento(), LocalDate.now());
                if (periodo.getYears() >= 18) {
                    imprime(alunos.get(i));
                }
            }}}
      // Relatório 3 -
    public static void relataAlunosMenosDeIdade(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            System.out.println("----------------------------------");
            System.out.println("Alunos Menores de Idade");
            System.out.println("----------------------------------");

            for (int i = 0; i < alunos.size(); i++) {
                Period periodo = Period.between(alunos.get(i).getDataNascimento(), LocalDate.now());
                if (periodo.getYears() < 18) {
                   imprime(alunos.get(i));
                }
            }}}

    public static void relataAlunosMenoresDeIdadeDoSexoMasculino(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            // Relatório 4 -

            System.out.println("Alunos menores de idade do sexo masculino");

            for (int i = 0; i < alunos.size(); i++) {
                Period periodo = Period.between(alunos.get(i).getDataNascimento(), LocalDate.now());
                if (periodo.getYears() < 18 && alunos.get(i).getSexo() == "menino") {
                    imprime(alunos.get(i));
                }
            }
        }
    }
    public static void relataAlunosMenoresdeIdadedoSexoFeminino(ArrayList<AlunoModel> alunos) {
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            // Relatório 5 -

            System.out.println("----------------------------------");
            System.out.println("Alunos menores de idade do sexo feminino");
            System.out.println("----------------------------------");

            for (int i = 0; i < alunos.size(); i++) {
                Period periodo = Period.between(alunos.get(i).getDataNascimento(), LocalDate.now());
                if (periodo.getYears() < 18 && alunos.get(i).getSexo() == "menina") {
                    imprime(alunos.get(i));
                }
            }
        }
    }
          // Relatório 6 -
    public static void relatarAniversarianteDoMes(ArrayList<AlunoModel> alunos) {
        LocalDate hoje = LocalDate.now();

        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
                for (int i = 0; i< alunos.size();  i++){
                    if(alunos.get(i).getDataNascimento().getMonth() == hoje.getMonth()){
                        imprime(alunos.get(i));
                    }
                }
            }
        }
            // Relatório 7 -
    public static void relatarMasculinoMaisVelho(ArrayList<AlunoModel> alunos) {
        AlunoModel maisVelho = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            System.out.println("----------------------------------");
            System.out.println("Aluno Masculino Mais Velho");
            System.out.println("----------------------------------");

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
            imprime(maisVelho);
        }
    }
         // Relatório 8 -
    public static void relatarMasculinoMaisNovo(ArrayList<AlunoModel> alunos) {
        AlunoModel maisNovo = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            System.out.println("----------------------------------");
            System.out.println("Aluno Masculino Mais Novo");
            System.out.println("----------------------------------");

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
            imprime(maisNovo);
        }
    }
         // Relatório 9 -
    public static void relatarFemininoMaisVelha(ArrayList<AlunoModel> alunos) {
        AlunoModel maisVelha = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            System.out.println("----------------------------------");
            System.out.println("Aluno Feminina Mais Velha");
            System.out.println("----------------------------------");

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
            imprime(maisVelha);
        }
    }
         // Relatório 10 -
    public static void relatarFemininaMaisNova(ArrayList<AlunoModel> alunos) {
        AlunoModel maisNova = new AlunoModel();
        if (alunos.size() == 0) {
            System.out.println("\n\nSem alunos cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {

            System.out.println("----------------------------------");
            System.out.println("Aluno Feminina Mais Nova");
            System.out.println("----------------------------------");

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

            }
            imprime(maisNova);
        }
    }


}

