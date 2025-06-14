public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada(int valor) {
        for (int i = 1; i < 11; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
    }
}
