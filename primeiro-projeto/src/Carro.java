public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço ano 1: " + precoAno1);
        System.out.println("Preço ano 2: " + precoAno2);
        System.out.println("Preço ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    public  double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public  double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public int calcularIdade(int idade) {
        return 2025 - ano;
    }
}
