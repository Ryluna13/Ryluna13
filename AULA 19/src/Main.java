public class Main {
    public static void main(String[] args) {

        // SUBSTRINGS

    String frase = "Essa Frase é um exemplo de uma escrita unica";

        System.out.println(frase.length());
        System.out.println(frase.charAt(1));

        char caracteres [] = {'s','e','n','h','a'};
        String palavra = new String(caracteres);

        System.out.println(palavra);

        System.out.println(palavra.codePointAt(0));
        // Códig Unico ASCII

        boolean condicao = true;

        System.out.println(condicao ? "VERDADE" : "Falso");

        int sexo = 1;

        System.out.println(sexo == 1 ? "Feminino" :  "Masculino");
        //Expressão Ternária

        condicao = sexo == 1 ? true : false;

        System.out.println(frase.startsWith("escola"));
        System.out.println(frase.endsWith("escola"));

        for(char letra : frase.toCharArray()){
            System.out.println("letra " + letra);
        }

        System.out.println(frase.trim());

        System.out.printf("Estou chegando ao Número %d entre %d.",171,200 );
        System.out.printf("Valor: R$ %.2f\n" , 1724.46548);
        double total = 2.0/7.0;
        System.out.printf("2/7 = %2f \n" ,total);

        System.out.printf(" A Frase \"%s\" foi usada como exemplo " , frase);

        System.out.println(frase.substring(12));

        System.out.println(frase.substring(0,11));
        System.out.println(frase.indexOf("exemplo"));
        System.out.println(frase.substring(frase.indexOf("exemplo")));



    }
}
