public class Animal {
    private boolean temPelos;

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
}