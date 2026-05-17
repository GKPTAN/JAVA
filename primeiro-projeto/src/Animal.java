public class Animal implements SerVivo {
    private boolean temPelos;
    private boolean vivo = true;

    public Animal() {

    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public void temPelos(boolean valor) {
        if (valor) {
            System.out.println("Tem pelos");
        } else {
            System.out.println("Não tem pelos");
        }
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    public void fazSom() {
        System.out.println("som do animal");
    }

    @Override
    public void mover(int x, int y) {

    }

    @Override
    public void comer(int massa) {

    }

    @Override
    public void info() {
        System.out.printf("Vivo: %s", this.vivo ? "sim" : "não");
    }
}