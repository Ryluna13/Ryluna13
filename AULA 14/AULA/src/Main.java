import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner get = new Scanner(System.in);
        
        int index = 1, numero;

        System.out.println("Qual a Tabuada: N° ");
        numero = get.nextInt();

        String path = "D:\\JAVA\\AULA 14\\SAIDAJAVA\\tabuada de " + numero +".txt";

        FileWriter arquivo = new FileWriter("D:\\JAVA\\AULA 14\\SAIDAJAVA\\tabuada de " + numero +".txt");
        // Criar a Pasta Um Lugar Que Todos Podem Ter acesso.
        // Permissão de leitura e gravação e que existe.
        // Na Máquina do usuário.

        PrintWriter escreveArquivo = new PrintWriter(arquivo);
        // Criando um escrito de arquivos para aquele arquivo.

        escreveArquivo.println("Tabuada de " + numero);
        escreveArquivo.println("---------------------");

        for(index = 1; index <=10; index ++){
            escreveArquivo.println(index + " x " + numero + " = " + (index * numero));
        }
        escreveArquivo.println("----------------------");

        arquivo.close();
        //Sempre fechar o Arquivo!!!

        System.out.println("Arquivo o gerado com Sucesso!");

        // ------ Leitura de Dados do Arquivo ------

        FileReader arquivoLeitura = new FileReader(path);
        BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

        String linha;

        while ((linha = leitorArquivo.readLine()) != null ){
            System.out.println(linha);
        }
        System.out.println("\n\n ------ Fim de Arquivo ------\n\n");

    }
}
