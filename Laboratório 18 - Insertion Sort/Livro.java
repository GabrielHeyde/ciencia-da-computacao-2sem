public class Livro {

    private String nome;
    private double preco;
    private int ano;

    public Livro(String nome, double preco, int ano) {
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getAno() {
        return ano;
    }

    public String toString() {
        return "Livro [nome=" + nome + ", preco=" + preco + ", ano=" + ano + "]";
    }

}
