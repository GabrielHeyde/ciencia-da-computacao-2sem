
import java.util.Scanner;

public class ContaPoupança extends Conta {

	Scanner scanner = new Scanner(System.in);
	
	public ContaPoupança(String nome) {
		super(nome);
	}
	
	public void rentabilidade() {
		System.out.println("Digite o valor que você deseja depositar na sua conta poupança: ");
		depositar(scanner.nextDouble());
		System.out.println("Em um mês, seu saldo terá rendido aproximadamente R$" + getSaldo()*0.00708 );
	}

}
