import java.util.Scanner;

public class arranjo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valores [] = new int[3];
        int tamanho = 0;

        System.out.print("Digite um valor: ");
        valores[0] = scanner.nextInt();
        System.out.print("Digite um valor: ");
        valores[1] = scanner.nextInt();
        System.out.print("Digite um valor: ");
        valores[2] = scanner.nextInt();

        System.out.println("Você digitou o valor: " + valores[0]);
        System.out.println("Você digitou o valor: " + valores[1]);
        System.out.println("Você digitou o valor: " + valores[2]);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = scanner.nextInt();
        };

        for (int i = 0; i < 3; i++) {
            System.out.println("Você digitou o valor: " + valores[i]);
        };

        //instanciando o arranjo de forma dinâmica
        System.out.print("Digite o tamanho do arranjo: ");
        tamanho = scanner.nextInt();
        valores = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = scanner.nextInt();
        };

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Você digitou o valor: " + valores[i]);
        };
    }
}
