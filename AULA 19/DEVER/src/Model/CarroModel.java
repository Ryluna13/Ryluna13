package Model;

public class CarroModel extends VeiculosModel implements PainelControle {
    public String fabricante,modelo,tipo;
    public double preco;
    public int ano;

    public CarroModel(){}

    public CarroModel(String fabricante, String modelo, String tipo, double preco, int ano) {
        super();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void ligaDesliga() {
        if(super.isOn()){
            super.setOn(false);
        }else{
            super.setOn(true);
        }
    }
    @Override
    public void mover(){
        if (super.isOn())
            if(super.isMovendo())
                super.setMovendo(false);
            else
                super.setMovendo(true);
    }
}



