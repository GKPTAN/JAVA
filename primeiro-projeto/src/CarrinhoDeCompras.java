import java.util.ArrayList;
import java.util.List;

public  class CarrinhoDeCompras {
    private double limite;
    private double saldo;
    private List<Produto> produtos;

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public CarrinhoDeCompras(double limite, double saldo, List<Produto> produtos) {
        this.limite = limite;
        this.saldo = saldo;
        this.produtos = new ArrayList<>();
    }

    public boolean lancaCompra(Produto produto) {
        if (this.saldo >= produto.getValor()) {
            this.saldo -= produto.getValor();
            this.produtos.add(produto);
            return true;
        }

        return false;
    }
}
