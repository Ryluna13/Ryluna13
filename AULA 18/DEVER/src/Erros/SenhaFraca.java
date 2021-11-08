package Erros;

public class SenhaFraca  extends  Throwable{
    @Override
    public String getMessage(){
        return " Senha Fraca \n A Senha (Precisa Ter um Caractere Special e Um Numero (ex:%&!@#$): \n"  ;
    }
}
