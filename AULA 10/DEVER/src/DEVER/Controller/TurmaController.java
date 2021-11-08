package DEVER.Controller;

import DEVER.Model.AlunoModel;
import DEVER.Model.TurmaModel;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TurmaController {
    public static void cadastra(ArrayList<TurmaModel> turmas ){
        Scanner read = new Scanner(System.in);
        TurmaModel turma = new TurmaModel();

        System.out.println("--------------------------------");
        System.out.println("------ Cadastro de Turmas ------");
        System.out.println("--------------------------------");

        System.out.println("Nome Da Turma : ");
        turma.setnTurma(read.nextLine());

        System.out.println("Início (dia/mês/ano): ");
        turma.setInicio(read.nextLine());

        System.out.println("Qual O Turna dessa Turma : (M/T/N)" );
        turma.setTurno(read.next());

        turmas.add(turma);
        System.out.println("\nCadastro realizado com sucesso!\n");
    }
    public static void imprime(TurmaModel turma) {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Número da Turma: " + turma.getnTurma());
        System.out.println("Nascimento: " + formatar.format(turma.getInicio()));
        System.out.println("Turno: " + turma.getTurno());
        if(turma.getFim() != null)
            System.out.println("Fim: " + formatar.format(turma.getFim()));
        else
            System.out.println("Fim: EM ANDAMENTO");

    }
    /// Excluir Turmas
    public static void exclui(ArrayList<TurmaModel> turmas) {
        if (turmas.isEmpty()) {
            System.out.println("\n\nSem Turmas cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            int index = 1;
            for(int i = 0 ; i <turmas.size(); i++){
                Scanner get = new Scanner(System.in);

                imprime(turmas.get(i));

                System.out.print("\n\nQual Turma deseja excluir? Nº \n\n");
                 index = get.nextInt() - 1;

                turmas.remove(index);
                System.out.println("\n\nTurma exluído com sucesso!\n\n");
            }
        }
    }
    //// Atulizar Turmas
    public static void atualiza(ArrayList<TurmaModel> turmas) {
        if (turmas.isEmpty()) {
            System.out.println("\n\nSem Turmas cadastrados!\n\n");
            System.out.println("-----------------------------------");
        } else {
            int index = 1 ;
            System.out.println("--------  ATUALIZAR TURMA ----------");
            Scanner get = new Scanner(System.in);
            for(int i = 0 ; i <turmas.size(); i++){

                System.out.println("Nº " + (i+1));
                imprime(turmas.get(i));
                System.out.println("----------------------------");

            }
            System.out.print("\n\nQual Turma deseja Atualizar? Nº \n\n");
            index = get.nextInt() - 1;

            System.out.println("A Turma Escolhida foi >");
            imprime(turmas.get(index));
            System.out.println("É possivel apenas definir a data de encerramento.");
            System.out.println("Digite a Data Final (dd/mm//aaaa), ou 0 para Cancelar");
            String recebe = get.nextLine();

            if (recebe.equals("0")){
                System.out.println("Atulização Cancelada!");
            }else{
                turmas.get(index).setFim(recebe);
                System.out.println("Atulização Realizada!");
            }

            turmas.remove(index);
            System.out.println("\n\nTurma Atualziada com sucesso!\n\n");
        }
    }
    /// Get all Turmas
    public static void getAll(ArrayList<TurmaModel> turmas){
        System.out.println("========Relatório Geral=========");
        for(int i = 0 ; i < turmas.size() ; i++){
            System.out.println("Nº " + (i+1));
            imprime(turmas.get(i));
            System.out.println("============================");
        }
    }
}
