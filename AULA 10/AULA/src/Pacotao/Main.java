package Pacotao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(15);

        List<String> lista2 =  new ArrayList<String>();
        lista2.add("João das Couves");
        lista2.add("aNA bALA");
        lista2.add("zECA bALA");
        lista2.add("tIÃO bALA");

        Collections.sort(lista2); // Ordem Crescente
        System.out.println(lista2);

        Collections.shuffle(lista2); // Ordem Decrescente
        System.out.println(lista2);

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno("Juca", "Java" , 7));
        alunos.add(new Aluno("Ana", "html" , 8));
        alunos.add(new Aluno("Jé", "css" , 10));

        Aluno a = new Aluno("Juca", "Node", 5 );

        ComparaAluno compara = new ComparaAluno();
        Collections.sort(alunos,compara);
        for (Aluno aluno : alunos){
            System.out.println("Nome: "  + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Nota: "  + aluno.getNota());
            System.out.println("==============================");
        }

    }
}
class Aluno implements Comparable<Aluno>{

    private String nome,curso;
    private double nota;

    public Aluno(String nome, String curso, double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno aluno){
        return this.curso.compareTo(aluno.getCurso());
    }
}
class ComparaAluno implements Comparator<Aluno>{

    public int compare(Aluno a,Aluno b){
        return a.getNome().compareTo(b.getCurso());
    }
}
