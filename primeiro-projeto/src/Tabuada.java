import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Tabuada de números inteiros");
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "x" + i + " = " + numero * i);
        }
    }
}
