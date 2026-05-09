public class Card extends Payment {
    private String card_number;

    @Override
    void processPayment() {
        System.out.printf("Pagamento de R$ %.2f realizado com o cartão %s\n", this.getValue(), this.card_number);
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
}
