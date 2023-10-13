public class Gerente extends Funcionario {
	
	private float bonus;
	
	public Gerente(int numeroHoras, float valorHora, float bonus) {
		super(numeroHoras, valorHora);
		this.bonus = bonus;
	}
	
	public float calcularSalario() {
		return super.calcularSalario() + bonus;
	}

}
