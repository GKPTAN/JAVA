import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Fatorial de números inteiros");
        System.out.println("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();
        int fatorial = 1;
        StringBuilder expressao = new StringBuilder();

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            expressao.append(i);
            if (i > 1) {
                expressao.append(" x ");
            }
        }

        System.out.println(expressao + " = " + fatorial);
        leitura.close();
    }
}
