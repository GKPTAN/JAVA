public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;
    double mediaDasAvaliacoes;
    String media;

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numeroDeAvaliacoes++;
    }

    double pegaMedia() {
        return avaliacao / numeroDeAvaliacoes;
    }

    void mostrarFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Média: " + media);
    }
}
