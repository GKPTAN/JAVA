public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private double totalDeNotas;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Média: " + String.format("%.1f", media));
    }

    /**
    * Essa função só pode ser chamada duas vezes
    */
    public void insereNota(double nota) {
        if (totalDeNotas > 2) {
            System.out.println("o sistema só pode receber duas notas!");
        } else {
            this.nota += nota;
            totalDeNotas++;
        }
    }

    public void calculaMedia() {
        media = nota / totalDeNotas;
    }
}
