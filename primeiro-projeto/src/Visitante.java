public class Visitante {
    String nome;
    int idade;
    static int totalVisitantes = 0;
    static int maiorIdade = 0;
    static String nomeMaisVelho;

    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        totalVisitantes++;
        if (idade > maiorIdade) {
            maiorIdade = idade;
            nomeMaisVelho = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    void exibirDados() {
        String dados = """
                ----------------------------------------------------------
                Nome: %s
                Idade: %d anos
                ----------------------------------------------------------
                \n
                """.formatted(nome, idade);

        System.out.println(dados);
    }

    public static void exibirEstatisticas() {
        String dados = """
                ----------------------------------------------------------
                Total de visitantes: %d
                Idade mais alta: %d
                Nome da pessoa mais velha: %s
                ----------------------------------------------------------
                """.formatted(totalVisitantes, maiorIdade, nomeMaisVelho);
        System.out.println(dados);
    }
}
