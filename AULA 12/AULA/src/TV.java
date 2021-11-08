import java.util.Scanner;

public abstract class TV {
    private int canal;
    private int volume;
    private boolean on;
    private int tela;
    private boolean mutar;

    protected  TV(int tela) {
        this.canal = 11;
        this.volume = 50;
        this.on = false;
        this.tela = tela;
        this.mutar = false;
    }

    protected boolean isMutar() {
        return mutar;
    }

    protected void setMutar(boolean mutar) {
        this.mutar = mutar;
    }
    protected int getCanal() {
        return canal;
    }

    protected void setCanal(int canal) {
        this.canal = canal;
    }

    protected int getVolume() {
        return volume;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected boolean isOn() {
        return on;
    }

    protected void setOn(boolean on) {
        this.on = on;
    }

    protected int getTela() {
        return tela;
    }



}

 interface ControleRemoto{
    void mudarCanal(int canal);
    void mudarVolume(int tantinho);
    void ligaDesliga();
    void mutar();
}
class TvModeloCCE01 extends TV implements ControleRemoto{

    private String modelo = "Tv-001MX";

    public TvModeloCCE01(int tela) {
        super(tela);
    }
    public String getModelo(){
        return this.modelo;
    }

    @Override
    public void mudarCanal(int canal) {
        if(super.isOn())
        super.setCanal(canal);
    }

    @Override
    public void mudarVolume(int tantinho) {
        if(super.isOn())
          if (super.getVolume()+ tantinho >100)
           super.setVolume(100);
          else if (super.getVolume()+ tantinho < 0)
              super.setVolume(0);
          else
              super.setVolume(super.getVolume()+tantinho);
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
    public void mutar() {
        if(super.isOn())
            if(isMutar())
                super.setMutar(false);
            else
                super.setMutar(true);

    }


}

class Roda {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        TvModeloCCE01 teve = new TvModeloCCE01(35);

        teve.ligaDesliga();

        teve.mudarCanal(45);
        System.out.println(teve.getCanal());
        teve.mudarVolume(12);
        System.out.println(teve.getVolume());
        teve.mutar();
        System.out.println(teve.isMutar() ?
                "Mudo": "Volume" + teve.getVolume());

        teve.ligaDesliga();




    }
}
