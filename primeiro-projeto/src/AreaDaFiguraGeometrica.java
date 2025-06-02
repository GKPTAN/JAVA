import java.util.Scanner;

public class AreaDaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("---------  MENU  ----------");
            System.out.println("1. Calcular a área do quadrado");
            System.out.println("2. Calcular a área do circulo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.printf("A área do quadrado é de %.0f", areaQuadrado);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    double areaCirculo = 3.14 * raio * raio;
                    System.out.printf("A área do círculo é de %.2f", areaCirculo);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida!, tente novamente");
                    System.out.println(" ");
                    break;
            }
        }
    }
}
