public class Circulo implements CalculoGeometrico {
    private double raio;
    private double pi = 3.14;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea(ParametrosGeometria valor) {
        return 3.14 * (valor.raio * valor.raio);
    }

    @Override
    public double calcularPerimetro(ParametrosGeometria valor) {
        return 2 * pi * valor.raio;
    }

    @Override
    public String toString() {
        return String.format("""
                
                Tamanho do raio: %.2f cm
                Área do círculo: %.2f cm²
                """, getRaio(), calcularArea(new ParametrosGeometria(0, 0, 0, getRaio())));
    }
}
