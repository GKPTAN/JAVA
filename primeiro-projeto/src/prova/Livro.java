package prova;

public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public  String status() {
        if (emprestado) {
            return "Indisponível";
        }
        return "disponível";
    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Java para iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}
