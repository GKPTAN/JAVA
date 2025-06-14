
public class Titulo implements Comparable<Titulo>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroNome) {
        return this.getNome().compareTo(outroNome.getNome());
    }
}
