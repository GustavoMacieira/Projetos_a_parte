import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo de adivinhação:");

        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Tente acertar o número de 1 a 10.");

        do{
            System.out.println("Digite o número;");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto){

                System.out.println("Parabens você acertou o numero:" + numeroSecreto);
            } else {
                System.out.println("Opa! Você errou tente novamente");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Você acertou em " + tentativas + " tentativas");
        scanner.close();
        }
    }
