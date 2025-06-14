public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea(ParametrosGeometria valor) {
        return valor.altura * valor.largura;
    }

    @Override
    public double calcularPerimetro(ParametrosGeometria valor) {
        return (valor.altura * valor.altura) + (valor.largura * valor.largura);
    }
}
