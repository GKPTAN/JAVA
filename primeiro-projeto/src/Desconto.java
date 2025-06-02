import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Sistema de descontos");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preço do produto: ");
        double originalPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("De quanto será o desconto?, desconto: ");
        int desconto = Integer.parseInt(scanner.nextLine());
        double descontoTotal = (originalPrice * desconto) / 100;
        String price = formatoBR.format(originalPrice - descontoTotal);
        System.out.println("O preço final do produto é de " + price + " reais");
    }
}
