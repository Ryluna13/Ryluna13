import Model.LivroModel;
import View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LivroModel> ListaLivros = new ArrayList<>();

        Menu.principal(ListaLivros);

    }
}
