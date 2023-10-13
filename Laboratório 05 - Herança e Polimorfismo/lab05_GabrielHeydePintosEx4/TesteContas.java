
public class TesteContas {

	public static void main(String[] args) {
		
		Conta[] banco = new Conta[10];
		
		for (int i = 0; i < banco.length; i++) {
			if(i == 0 || i/2 == 0) {
				banco[i] = new ContaCorrente("0000");
			}
			else {
				banco[i] = new ContaPoupança("11111");
			}
		}
		
		for (int i = 0; i < banco.length; i++) {
			if(banco[i] instanceof ContaCorrente) {
				ContaCorrente corrente = (ContaCorrente) banco[i];
				corrente.pagarConta();
			}
			else {
				ContaPoupança poupança = (ContaPoupança) banco[i];
				poupança.rentabilidade();
			}
		}
	}

}
