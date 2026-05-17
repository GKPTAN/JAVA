public class Vegetal {
    private boolean vivo;
    private int massa;

    public Vegetal(int massa) {
        this.massa = massa;
        this.vivo = true;
    }

    public int getMassa() {
        return massa;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void info(){
        String info = """
                Tipo......: %s
                Vivo......: %s
                Massa.....: %d KG
                ---------------------------------------
                """.formatted(getClass().toString(), (this.vivo ? "sim" : "não"), this.getMassa());

        System.out.println(info);
    }
}
