import java.util.Arrays;
import java.util.Collections;

public class ArrayMetthods {
    public static void main(String[] args) {
        final int tam = 10;
        Integer[] num = {3,9,8,7,6,4,5,1,2,0};
        int[] numeros = new int[tam];
        //int p = 15;
        //int pos;
        for(int n:num) {
            System.out.printf("%d - ", n); //percorre o array para leitura de dados;
        };

        //pos = Arrays.binarySearch(num, p);
        //Arrays.sort(num, Collections.reverseOrder()); //Organiza de forma ordenada os elementos do array;
        //Arrays.fill(numeros, 10); preenche um array vazio com o valor indicado;
        //System.arraycopy(num, 0, numeros, 0, 10); //cria a cópia de um array;
        System.out.println("\n-----------------------------------------");
        //System.out.printf("o elemento %d está no array?, resposta: %s",p, pos >= 0 ? "Sim" : "Não");
        //System.out.printf("os arrays são iguais?, resposta: %s", Arrays.equals(num, numeros) ? "Sim" : "Não");
        for(int n:num) {
            System.out.printf("%d - ", n); //percorre o array para leitura de dados
        };

        int[][] numMatriz = new int[2][9];

        for (int[] r:numMatriz) {
            Arrays.fill(r, 5);
        }

        System.out.println(Arrays.deepToString(numMatriz));
    }
}
