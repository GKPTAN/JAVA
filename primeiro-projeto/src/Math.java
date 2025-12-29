public class Math {

    private static double valorPI = 3.14;

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        return valorPI * raio * raio;
    }
}
