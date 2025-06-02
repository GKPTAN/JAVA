import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        System.out.println("Sistema de comparação de números");
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = leitura.nextInt();
        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números que você digitou são iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.printf("Os números são diferentes, %d é maior do que %d", primeiroNumero, segundoNumero);
        } else {
            System.out.printf("Os números são diferentes, %d é menor do que %d", primeiroNumero, segundoNumero);
        }
    }
    }
