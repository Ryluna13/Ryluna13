import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter arquivo = new FileWriter("D:\\JAVA\\AULA 15\\SAIDAJAVA\\importação.txt",true);
        PrintWriter escreveArquivo = new PrintWriter(arquivo);
            while(0==0) {
                Scanner get = new Scanner(System.in);
                System.out.println("---- Cadastro de Pessoa ----");
                int opcao = 0;

                System.out.println("(1)Cadastrar");
                System.out.println("(0)Sair");
                System.out.print("Escolha uma opção: ");
                opcao = get.nextInt();

                switch (opcao) {
                    case 1:
                    String path = "D:\\JAVA\\AULA 15\\SAIDAJAVA\\importação.txt";
                    String nome, senha;

                    System.out.print("Seu nome:");
                    nome = get.next();
                    System.out.print("Sua Senha: ");
                    senha = get.next();

                    System.out.println(" Usuario Cadastrado! ");

                    escreveArquivo.println("---------------------");
                    escreveArquivo.println(nome + ";" + senha);


                    arquivo.close();

                    FileReader arquivoLeitura = new FileReader(path);
                    BufferedReader leitorArquivo = new BufferedReader(arquivoLeitura);

                    String linha;

                    while ((linha = leitorArquivo.readLine()) != null) {
                        System.out.println(linha);
                    }
                    System.out.println("\n------ Fim de Arquivo ------\n");
                    break;
                    case 2:
                        System.exit(1);
                        break;


                }

            }



    }
}
