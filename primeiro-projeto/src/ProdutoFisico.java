public class ProdutoFisico implements Calculavel {
    private double monitor = 18000.00;
    private double pc = 120000.00;
    private double mesa = 60000;
    private double foneDeOuvido = 320.00;
    private double microfone = 8500.00;

    public double getMonitor() {
        return monitor;
    }

    public void setMonitor(double monitor) {
        this.monitor = monitor;
    }

    public double getPc() {
        return pc;
    }

    public void setPc(double pc) {
        this.pc = pc;
    }

    public double getMesa() {
        return mesa;
    }

    public void setMesa(double mesa) {
        this.mesa = mesa;
    }

    public double getFoneDeOuvido() {
        return foneDeOuvido;
    }

    public void setFoneDeOuvido(double foneDeOuvido) {
        this.foneDeOuvido = foneDeOuvido;
    }

    public double getMicrofone() {
        return microfone;
    }

    public void setMicrofone(double microfone) {
        this.microfone = microfone;
    }

    @Override
    public double definirPrecoFinal(double valor) {
        if (valor > 96000) {
            double desconto = (valor * 10) / 100;
            valor -= desconto;
            return valor;
        } else {
            valor *= 1.50;
            return valor;
        }
    }
}
