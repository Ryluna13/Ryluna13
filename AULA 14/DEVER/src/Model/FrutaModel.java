package Model;

public class FrutaModel {
    private String nome;
    double preco;

    public FrutaModel(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public FrutaModel(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
