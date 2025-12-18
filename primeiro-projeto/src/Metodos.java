public class Metodos {
    public static void main(String[] args) {

        int r;
        msg("CFB cursos", 2);
        r = soma(75, 33);
        System.out.println("A soma dos valores é: " + r);
        System.out.println("A soma de todos os valores adicionados é: " + somas(60,59,56));
    }

    public static int somas(int... numeros) {
        int res = 0;
        for (int n:numeros) {
            res+=n;
        };
        return res;
    }

    public static Double somas(Double... numeros) {
        Double res = 0.0;
        for (Double n:numeros) {
            res+=n;
        };
        return res;
    }

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static void msg(String m, int l) {
        for (int i = 0; i < l; i++) {
            System.out.println(m);
        }
    }
}
