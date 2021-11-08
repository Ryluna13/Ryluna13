package DEVER;
import java.util.Scanner;

public class DEVER {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[10];
        Scanner get = new Scanner(System.in);


        System.out.println("+++++++Criação DE LUTADORES+++++++");


        for(int i = 0 ; i < lutadores.length ; i++){
            lutadores[i] = new Lutador();

            System.out.println("Deseja cadastrar um novo lutador? (0)Sim (1) Não");
            int opcao = get.nextInt();
            if(opcao == 1){
                break;
            }

            System.out.print("Nome do lutador: ");
            lutadores[i].setNome(get.next());

            System.out.print("Sua Idade: ");
            lutadores[i].setIdade(get.nextInt());

            System.out.print("Seu Sexo: ");
            lutadores[i].setSexo(get.next());

            System.out.print("Sua Altura(m): ");
            lutadores[i].setAltura(get.nextDouble());

            System.out.print("Seu Peso(Kg): ");
            lutadores[i].setPeso(get.nextDouble());


        }

        System.out.println("Lutadores cadastrados");

        System.out.println("Mulheres menores de idade:");
        for(int i = 0 ; i <lutadores.length ; i++){// feminino menor
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getMulherMenor();
        }

        System.out.println("-------------------------------\nMasculino menores de idade:");
        for(int i = 0 ; i <lutadores.length ; i++){// masculino menor
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getHomemMenor();
        }

        System.out.println("-------------------------------\nFeminino:");
        for(int i = 0 ; i <lutadores.length ; i++){    //Feminino Maior
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getMulher();
        }

        System.out.println("-------------------------------\nMasculino:");
        for(int i = 0 ; i <lutadores.length ; i++){    //Masculino Maior
            if(lutadores[i] == null){
                break;
            }
            lutadores[i].getHomem();
        }

    }

}
