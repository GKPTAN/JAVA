public class Quadrado implements CalculoGeometrico {
    private double tamanhoDosLados;

    public double getTamanhoDosLados() {
        return tamanhoDosLados;
    }

    public void setTamanhoDosLados(double tamanhoDosLados) {
        this.tamanhoDosLados = tamanhoDosLados;
    }

    @Override
    public double calcularPerimetro(ParametrosGeometria valor) {
        return valor.lado * 4;
    }

    @Override
    public double calcularArea(ParametrosGeometria valor) {
        return valor.lado * valor.lado;
    }

    @Override
    public String toString() {
        return String.format("""
                
                Lados: 4
                Tamanho de cada lado: %.2f cm
                Área do quadrado: %.2f cm²
                """, getTamanhoDosLados(), calcularArea(new ParametrosGeometria(0, 0, getTamanhoDosLados(), 0)));
    }
}
