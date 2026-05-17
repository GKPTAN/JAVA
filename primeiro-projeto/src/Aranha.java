import java.lang.Math;

public class Aranha extends AnimalA {
    private int veneno;
    public Aranha(int massa, int forca, int velocidade, int vida, int veneno) {
        super(massa, forca, velocidade, vida);
        this.veneno = veneno;
    }

    @Override
    public void atacar(AnimalA a, int golpes) {
        if(this.isVivo()) {
            if(this.getForca() + this.veneno > a.getForca()) {
                a.setVida(this.veneno + this.getForca());
                if (a.getVida() <= 0) {
                    a.setVivo(false);
                    this.setForca(a.getMassa());
                    System.out.println(this.getClass().toGenericString() + " venceu e " + a.getClass().toGenericString() + " morreu!");
                }
            } else if (this.getForca() == a.getForca()) {
                System.out.println("Empate, as forças são iguais");
            } else {
                this.setVida((int) (Math.floor((Math.random() * 100) + 1)) * a.getForca());
                if (this.getVida() <= 0) {
                    this.setVivo(false);
                    a.setForca(this.getMassa());
                    System.out.println(a.getClass().toGenericString() + " venceu e " + this.getClass().toGenericString() + " morreu!");
                }
            }
        } else {
            System.out.println("--------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar");
            System.out.println("--------------------------------");
        }
    }
}
