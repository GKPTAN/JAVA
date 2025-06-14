public class ProdutoPerecivel extends Produto {
    private String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public ProdutoPerecivel(String nome, double preco, String data) {
        super(nome, preco);
        this.dataDeValidade = data;
    }
}
