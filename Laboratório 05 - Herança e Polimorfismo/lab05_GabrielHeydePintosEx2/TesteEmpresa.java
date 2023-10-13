public class TesteEmpresa {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Gerente(160, 30, 100);
		float salario = funcionario1.calcularSalario();
		System.out.println("Salário do Gerente: " + salario);
		
		Funcionario funcionario2 = new Desenvolvedor(160, 20, 50);
		salario = funcionario2.calcularSalario();
		System.out.println("Salário do dev: " + salario);
		
		Funcionario func = new Gerente(200, 40, 300);
		func = funcionario2;
		salario = func.calcularSalario();
		System.out.println("Salário do dev2: " + salario);
	}

}
