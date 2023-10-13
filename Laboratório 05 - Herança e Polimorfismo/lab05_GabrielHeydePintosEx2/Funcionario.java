public abstract class Funcionario {
	
	protected int numeroHoras;
	protected float valorHora;
	
	
	
	public Funcionario(int numeroHoras, float valorHora) {
		super();
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}
	

	public float calcularSalario() {
		return numeroHoras * valorHora;
	}

}
