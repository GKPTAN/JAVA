import java.util.Scanner;
import java.security.SecureRandom;

public class Matriz {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String dados[][] = new String[3][3];
        int linha,coluna = 0;

        System.out.print("Digite o valor para a posição 1,1: ");
        dados[1][1] = scanner.nextLine();

        System.out.println("O valor da posição 1,1 é" + dados[1][1]);

        System.out.print("Digite a quantidade de linhas: ");
        linha = scanner.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        coluna = scanner.nextInt();

        dados = new String[linha][coluna];

        System.out.print("Digite a linha para armazenar: ");
        linha = scanner.nextInt()-1;
        System.out.print("Digite a coluna para armazenar: ");
        coluna = scanner.nextInt()-1;
        scanner.nextLine();

        System.out.print("Digite o valor para armazenar: ");
        dados[linha][coluna] = scanner.nextLine();

        System.out.println("O valor armazenado na posição (" + (linha+1) + "," + (coluna+1) + ") é" + dados[linha][coluna]);*/

        final int linhas = 5;
        final int colunas = 3;
        int[][] numeros = new int[linhas][colunas];
        int[][] num = {{0,1,2,3,4},{5,6,7,8,9},{0,6,2,8,4}};

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        /*for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf(" %2d |", numeros[l][c]);
            }
            System.out.printf("%n");
        }*/

        for (int[] n:num) {
            for (int v:n) {
                System.out.printf(" %2d |", v);
            }
            System.out.printf("%n");
        }
    }
}
