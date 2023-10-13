public class Registro {

    private String classe;
    private String metodo;
    private int linha;

    public Registro(String classe, String metodo, int linha) {
        this.classe = classe;
        this.metodo = metodo;
        this.linha = linha;
    }

    public String toString() {
        return classe + "." + metodo + "():" + linha;
    }

    public String getClasse() {
        return classe;
    }

    public String getMetodo() {
        return metodo;
    }

    public int getLinha() {
        return linha;
    }

    
}