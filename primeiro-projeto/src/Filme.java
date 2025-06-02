public class Filme {
    public static void main(String[] args) {
            String filme = "Motoqueiro Fantasma";
            System.out.println("Filme: " + filme);
            int anoDeLancamento = 2006;
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            boolean incluidoNoPlano = true;
            String comment = "Filme muito bom";
            System.out.println("Avaliação: " + comment);
            double nota = 8.9;
            System.out.println("Nota: " + nota);
            double media = (4.2 + 6.3 + 6.7) / 3;
            String sinopse;
            sinopse = """
                    Filme de ação com Nicolas Cage
                    que interpreta um motoqueiro amaldiçoado
                    por Satan.
                    """;
            System.out.println("Sinopse: " + sinopse);
            System.out.println("media: " + media);
            System.out.println("incluido no plano?: " + (!incluidoNoPlano ? "não" : "sim"));
    }
}
