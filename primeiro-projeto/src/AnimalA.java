import java.lang.Math;

abstract class AnimalA implements SerVivo {
    private boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int forca;
    private int velocidade;
    private int vida;

    public AnimalA(int massa, int forca, int velocidade, int vida) {
        this.vivo = true;
        this.forca = forca;
        this.massa = massa;
        this.velocidade = velocidade;
        this.x = 0;
        this.y = 0;
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getMassa() {
        return massa;
    }

    public int getForca() {
        return forca;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public void setForca(int forca) {
        this.forca += forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida -= vida;
    }

    public void mover(int x, int y){
        if(this.vivo) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("--------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode se mover");
            System.out.println("--------------------------------");
        }
    }
    public void atacar(AnimalA a, int golpes) {
        if(this.vivo) {
            if(this.forca > a.forca) {
                a.vida -= golpes * this.forca;
                if (a.vida <= 0) {
                    a.vivo = false;
                    this.forca += a.massa;
                    System.out.println(this.getClass().toGenericString() + " venceu e " + a.getClass().toGenericString() + " morreu!");
                }
            } else if (this.forca == a.forca) {
                System.out.println("Empate, as forças são iguais");
            } else {
                this.vida -= (int) (Math.floor((Math.random() * 100) + 1)) * a.forca;
                if (this.vida <= 0) {
                    this.vivo = false;
                    a.forca += this.massa;
                    System.out.println(a.getClass().toGenericString() + " venceu e " + this.getClass().toGenericString() + " morreu!");
                }
            }
        } else {
            System.out.println("--------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode atacar");
            System.out.println("--------------------------------");
        }
    }

    public void comer(int massa){
        if(this.vivo) {
            this.vida += massa;
        } else {
            System.out.println("--------------------------------");
            System.out.println(this.getClass().toGenericString() + " está morto, não pode comer");
            System.out.println("--------------------------------");
        }
    }
    public void info(){
        String info = """
                Tipo......: %s
                Vivo......: %s
                Massa.....: %d KG
                Velocidade: %d km/h
                Força.....: %d
                ---------------------------------------
                """.formatted(getClass().toString(), (this.isVivo() ? "sim" : "não"), this.getMassa(),  this.velocidade, this.forca);

        System.out.println(info);
    }
}
