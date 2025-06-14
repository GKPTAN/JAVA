public class Livro implements Calculavel {
    private double gameOfThrones = 159.99;
    private double naoViENaoGostei= 18.50;
    private double domineOInstagram = 49.99;
    private double comoEuEraAntesDeVoce = 85.50;
    private double theOnlyThing = 33.50;

    public double getGameOfThrones() {
        return gameOfThrones;
    }

    public double getNaoViENaoGostei() {
        return naoViENaoGostei;
    }

    public double getDomineOInstagram() {
        return domineOInstagram;
    }

    public double getComoEuEraAntesDeVoce() {
        return comoEuEraAntesDeVoce;
    }

    public double getTheOnlyThing() {
        return theOnlyThing;
    }

    @Override
    public double definirPrecoFinal(double valor) {
        if (valor > 152) {
            double desconto = (valor * 36) / 100;
            valor -= desconto;
            return valor;
        } else {
            valor *= 1.50;
            return valor;
        }
    }
}
