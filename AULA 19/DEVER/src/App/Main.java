package App;

import Model.BarcoModel;
import Model.CarroModel;
import Model.MotoModel;
import View.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarroModel> listaCarros = new ArrayList<>();
        ArrayList<MotoModel> listaMotos = new ArrayList<>();
        ArrayList<BarcoModel> listaBarcos = new ArrayList<>();

        Menu.principal(listaCarros,listaMotos,listaBarcos);
    }
}
