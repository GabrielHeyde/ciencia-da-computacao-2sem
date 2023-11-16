public class Aluno {
	
	private String nome;
	private double notaA;
	private double notaB;
	
	public Aluno(String nome, double grauA, double grauB) {
		this.nome = nome;
		this.notaA = grauA;
		this.notaB = grauB;
	}

	public String getNome() {
		return nome;
	}

	public double getNotaA() {
		return notaA;
	}

	public double getNotaB() {
		return notaB;
	}

	public String toString() {
		return "Aluno [nome=" + nome + ", grauA=" + notaA + ", grauB=" + notaB + "]";
	}

}
