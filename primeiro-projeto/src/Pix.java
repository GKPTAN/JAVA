public class Pix extends Payment{
    private String keyPix;

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

    @Override
    void processPayment() {
        System.out.printf("Pagamento de R$ %.2f realizado via pix para a chave %s\n", this.getValue(), this.keyPix);
    }
}
