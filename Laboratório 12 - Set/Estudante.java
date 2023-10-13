public class Estudante implements Comparable<Estudante> {

    String nome;
    double notas;

    public Estudante(String nome, double notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public int compareTo(Estudante o) {
        if (getNotas() > o.getNotas()) {
            return -1;
        } else {
            if (getNotas() < o.getNotas()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
