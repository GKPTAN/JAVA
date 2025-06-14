public class Servicos implements Vendavel {
    private String descricao;
    private double precoHora;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return 0;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {

    }
}
