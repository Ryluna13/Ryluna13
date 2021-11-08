package Model;

public abstract class VeiculosModel {

    protected boolean on,movendo;

    protected VeiculosModel() {
        this.on = false;
        this.movendo = true;
    }

    protected boolean isOn() {
        return on;
    }

    protected void setOn(boolean on) {
        this.on = on;
    }

    protected boolean isMovendo() {
        return movendo;
    }

    protected void setMovendo(boolean movendo) {
        this.movendo = movendo;
    }


}

interface PainelControle{
    void ligaDesliga();
    void mover();
}
