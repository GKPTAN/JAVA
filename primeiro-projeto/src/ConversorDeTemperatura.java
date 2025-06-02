import java.util.Arrays;
import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        System.out.println("Conversor de temperatura de graus celsius para fahrenheit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura que você quer converter: ");
        String graus = scanner.nextLine();
        String[] analiseTemperatura = graus.split(" ");
        double temperatura = Double.parseDouble(analiseTemperatura[0]);
        int converterParaFahrenheit = (int) (temperatura * 1.8) + 32;
        System.out.println("calculando...");
        System.out.println("Temperatura em Fahrenheit: " + converterParaFahrenheit + "°F graus");
    }
}
