import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Olá, " + name + "!");
        System.out.println("Tudo bem?");
        int idade = 23;
        double dinheiro = 77.202;
        System.out.printf("%s, você tem %d anos, e pode se candidatar para a prova, a taxa de inscrição será de %.2f%n reais", name, idade, dinheiro);
        String texto = """
                olá %s,
                bem-vindo ao curso de java,
                terá %d aulas durante o curso para se aprofundar nessa linguagem de programação
                """.formatted(name, idade);
        System.out.println(texto);
        char letra = 'e';
        String palavra = "ordem";
        String frase = palavra + " " + letra + " progresso";
        System.out.println(frase);
    }
}
