
import java.util.Scanner;

public class ContaCorrente extends Conta {

	Scanner scanner = new Scanner(System.in);
	
	public ContaCorrente(String nome) {
		super(nome);
	}
	
	public void pagarConta() {
		System.out.println("Digite o valor do depósito que você deseja fazer para pagar a conta: ");
		depositar(scanner.nextDouble());
		System.out.println("Digite o valor do pagamento que você deseja realizar: ");
		double custo = scanner.nextDouble();
		if(custo > getSaldo()) {
			System.out.println("ERRO! Saldo insuficiente.");
		}
		else {
			System.out.println("Pagamento realizado com sucesso!");
		}
	}

}