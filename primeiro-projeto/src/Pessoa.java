public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade (int idade) {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Idade: " + this.getIdade();
    }
}
