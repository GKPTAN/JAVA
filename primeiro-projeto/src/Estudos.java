import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------  Calculadora de Média Escolar  --------------------");
        System.out.println("Digite a primeira nota: ");
        double primeiraNota = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a segunda nota: ");
        double segundaNota = Double.parseDouble(scanner.nextLine());
        double media = (primeiraNota + segundaNota) / 2;
        System.out.printf("a média do aluno foi de %.1f", media);
    }
}
