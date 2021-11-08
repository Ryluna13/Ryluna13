package MAIN;

import Model.AlunoModel;
import View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<AlunoModel> listaAlunos = new ArrayList<>();


        Menu.principal(listaAlunos);
    }
}
