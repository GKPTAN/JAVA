import java.util.Scanner;

public class MainA {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int option = 0;
        String menu = """
                ------ Formas de Pagamento ------
                1 - Pagar em Cartão
                2 - Pagar no pix
                3 - Sair
                """;

        while (option != 3) {
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    processCard();
                    break;
                case 2:
                    processPix();
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void processCard() {
        String numberCard = getNumberCard();
        double value = getValue();

        Card card_payment = new Card();
        card_payment.setCard_number(numberCard);
        card_payment.setValue(value);
        card_payment.processPayment();
        card_payment.displayReceipt();
    }

    public static void processPix() {
        String numberPix = getKeyPix();
        double value = getValue();

        Pix pix_payment = new Pix();
        pix_payment.setKeyPix(numberPix);
        pix_payment.setValue(value);
        pix_payment.processPayment();
        pix_payment.displayReceipt();
    }

    public static String getKeyPix() {
        while (true) {
            System.out.print("Digite a chave do seu pix: ");
            String pix = scanner.nextLine();

            if (pix.length() < 11) {
                System.out.println("Valor inválido! a chave pix deve ser um cpf, número de telefone ou chave aleatória");
            } else {
                return pix;
            }
        }
    }

    public static String getNumberCard() {
        while (true) {
            System.out.print("Digite o número do cartão de crédito: ");
            String card = scanner.nextLine();

            if (card.length() != 16) {
                System.out.println("valor inválido!, o número do cartão precisa ter exatamente 16 dígitos");
            } else {
                return card;
            }
        }
    }

    public static double getValue() {
        while (true) {
            System.out.print("Digite o valor do pagamento: ");
            double payment = scanner.nextDouble();
            scanner.nextLine();

            if(payment <= 0) {
                System.out.println("Valor inválido, o valor do pagamento deve ser acima de 0");
            } else {
                return payment;
            }
        }
    }
}
