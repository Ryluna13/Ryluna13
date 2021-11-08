package App;

import Model.PessoaModel;
import View.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaModel> listaPessoas = new ArrayList<>();

        View.inicio(listaPessoas);
    }
}
