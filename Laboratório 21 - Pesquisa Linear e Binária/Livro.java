public class Livro implements Comparable <Livro>{

    private String nome;
    private String autor;
    private int ano;
    private String isbn;

    public Livro(String nome, String autor, int ano, String isbn) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "nome=" + nome + ", \nautor=" + autor + ", \nano=" + ano + ", \nisbn=" + isbn + "\n";
    }

    public int compareTo(Livro o) {
        return this.isbn.compareTo(o.isbn);
    }

}
