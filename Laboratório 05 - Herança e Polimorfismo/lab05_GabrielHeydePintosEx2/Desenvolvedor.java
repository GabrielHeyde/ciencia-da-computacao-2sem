public class Desenvolvedor extends Funcionario {

	private int horasExtras;
	
	public Desenvolvedor(int numeroHoras, float valorHora, int horasExtras) {
		super(numeroHoras, valorHora);
		this.horasExtras = horasExtras;
	}
	
	public float calcularSalario() {
		float salarioNormal = super.calcularSalario();
		float valorHoraExtra = super.valorHora * 1.5F;
		float salarioExtra = horasExtras * valorHoraExtra;
		return salarioNormal + salarioExtra;
	}

}
