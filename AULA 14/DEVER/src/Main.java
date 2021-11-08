import Controller.FrutaController;
import Model.FrutaModel;
import View.Menu;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<FrutaModel> listaFrutas = new ArrayList<>();

        Menu.inicio(listaFrutas);
    }
}
