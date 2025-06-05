import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno; ");
        aluno.setNome(scanner.nextLine());
        System.out.print("Idade do aluno: ");
        aluno.setIdade(scanner.nextInt());
        System.out.print("digite a primeira nota: ");
        aluno.insereNota(scanner.nextDouble());
        System.out.print("digite a segunda nota: ");
        aluno.insereNota(scanner.nextDouble());
        aluno.calculaMedia();
        aluno.exibirInformacoes();
    }
}