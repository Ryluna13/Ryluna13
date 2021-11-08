package DEVER;

import DEVER.Model.AlunoModel;
import DEVER.Model.MatriculaModel;
import DEVER.Model.TurmaModel;
import DEVER.View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AlunoModel> listaAlunos = new ArrayList<>();
        ArrayList<TurmaModel> listaTurmas = new ArrayList<>();
        ArrayList<MatriculaModel> listaMatriculas = new ArrayList<>();

        Menu.principal(listaAlunos,listaTurmas,listaMatriculas);
    }
}
