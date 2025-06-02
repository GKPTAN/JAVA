import java.util.Scanner;

public class TipoDeNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Sistema de identificação de números positivos ou negativos");
        System.out.println("Digite um número que seja maior ou menor do que 0");
        int numero = leitura.nextInt();
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Número neutro");
        }
        if (numero % 2 == 0) {
            System.out.printf("Número %d é par", numero);
        } else {
            System.out.printf("Número %d é ímpar", numero);
        }
    }
}
