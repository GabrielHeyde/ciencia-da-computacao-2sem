public class ContaTeste {

	public static void main(String[] args) {
		
		Conta teste = new Conta("9877-9");
		
		while(true) {
			
			System.out.println("MENU \n1 - Exibir informações da conta \n2 - Saque \n3 - Depósito \n4 - Encerrar \n");
			
			int opcao = Teclado.leInt("Digite a opção desejada: ");
			
			if(opcao == 1) {
				System.out.println(teste.toString());
				System.out.println("");
			}
			
			if(opcao == 2) {
				double valor = Teclado.leDouble("Digite o valor que você deseja sacar de sua conta: ");
				teste.sacar(valor);
				System.out.println("");

			}
			
			if(opcao == 3) {
				double valor = Teclado.leDouble("Digite o valor que você deseja depositar na sua conta: ");
				teste.depositar(valor);
				System.out.println("");

			}
			
			if(opcao == 4) {
				break;
			}
		}
	}
}