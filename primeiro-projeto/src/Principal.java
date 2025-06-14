import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************** Gestão da festa ********************");
        System.out.println("********** Digite uma das opções abaixo **********");
        String menu = """
                1 - ver a lista de convidados
                2 - Adicionar novos convidados
                3 - sair
                """;
        int option = 0;
        String nome;
        ArrayList<String> convidados = new ArrayList<>();
        while (option != 3) {
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("***** Lista de convidados *****");
                    if (convidados.isEmpty()) {
                        System.out.println(" ");
                        System.out.println("Lista vazia");
                        System.out.println(" ");
                        System.out.println("******************************");
                    } else {
                        System.out.println(" ");
                        for (int i = 0; i < convidados.size(); i++) {
                            System.out.println((i + 1) + " - " + convidados.get(i));
                        }
                        System.out.println(" ");
                        System.out.println("******************************");
                    }
                    break;
                case 2:
                    System.out.print("Nome do convidado: ");
                    nome = scanner.nextLine();
                    if (convidados.contains(nome)) {
                        System.out.println("Esse nome já está na lista!");
                    } else {
                        convidados.add(nome);
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
