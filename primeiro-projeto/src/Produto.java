import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.valor, outroProduto.valor);
    }
}
