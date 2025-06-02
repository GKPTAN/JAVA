import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("------------------------------- Calculadora de preços -------------------------------");
        System.out.println("Produto a ser adquirido: ");
        String produto = scanner.nextLine();
        System.out.println("Quantidade: ");
        int quantidade = Integer.parseInt(scanner.nextLine());
        double price;
        if (produto.equalsIgnoreCase("celular")) {
            price = 5799.75;
        } else if (produto.equalsIgnoreCase("monitor")) {
            price = 144200.75;
        } else {
            price = 131.75;
        }
        double sumOfPrices = quantidade * price;
        double priceConvertToBR = sumOfPrices * 4.94;
        String totalPrice = formatoBR.format(priceConvertToBR);
        System.out.println("Preço total: " + totalPrice);
    }
}
