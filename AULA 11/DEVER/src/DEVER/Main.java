package DEVER;

import DEVER.Model.CadastroModel;
import DEVER.View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CadastroModel> listaPessoas = new ArrayList<>();


        Menu.principal(listaPessoas);


    }
}
