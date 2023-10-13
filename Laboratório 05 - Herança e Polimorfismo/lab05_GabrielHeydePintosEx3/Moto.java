import java.util.Scanner;

public class Moto extends Veiculo {
	
	Scanner scanner = new Scanner(System.in);
	
	private int qPessoas;
	

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	public int getqPessoas() {
		return qPessoas;
	}

	public void setqPessoas(int qPessoas) {
		this.qPessoas = qPessoas;
	}

	public void empinar() {
		while(qPessoas != 1 && qPessoas !=2) {
			System.out.println("Digite a quantidade de pessoas que estão na moto: ");
			setqPessoas(scanner.nextInt());
			if(qPessoas < 1 || qPessoas > 2) {
				System.out.println("Erro! Capacidade de uma ou duas pessoas, digite novamente.");
			}
		}
		
		if(qPessoas == 1) {
			System.out.println("Com uma pessoa na moto, é mais seguro empinar!");
		}
		else if(qPessoas == 2) {
			System.out.println("Com duas pessoas na moto, é menos seguro empinar!");
		}
	}

}
