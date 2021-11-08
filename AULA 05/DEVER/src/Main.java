import Model.LivroModel;
import Model.ClienteModel;
import Model.FuncionarioModel;
import View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LivroModel> listalivros = new ArrayList<>();
        ArrayList<FuncionarioModel> listafuncionarios = new ArrayList<>();
        ArrayList<ClienteModel> listaclientes = new ArrayList<>();


        Menu.principal(listalivros,listafuncionarios,listaclientes);
    }
}
