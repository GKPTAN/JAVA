import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        System.out.println("Sorteio de números --- Adivinhe o número sorteado --- tentativas: 5");
        Scanner leitura = new Scanner(System.in);
        int tentativas = 5;
        int numeroSorteado;
        numeroSorteado = new Random().nextInt(100);
        int numeroEscolhido;

        while (tentativas != 0) {
            System.out.println("Digite um número: ");
            numeroEscolhido = leitura.nextInt();
            if (numeroEscolhido == numeroSorteado) {
                System.out.println("Parabéns, você acertou o número sorteado!");
                break;
            } else if (numeroEscolhido > numeroSorteado) {
                tentativas--;
                System.out.println("O número sorteado é menor do que o número que você escolheu!, tentativas restantes: " + tentativas);
            } else {
                tentativas--;
                System.out.println("O número sorteado é maior do que o número que você escolheu!, tentativas restantes: " + tentativas);
            }

            if (tentativas == 0) {
                System.out.println("Suas tentativas acabaram, você perdeu mané");
            }
        }
    }
}
