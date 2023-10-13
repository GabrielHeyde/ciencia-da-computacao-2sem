import java.util.Scanner;

public class Caminhão extends Veiculo {
	
	Scanner scanner = new Scanner(System.in);
	
	public Caminhão(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		}

	public void frete() {
		System.out.println("Digite quantos km serão rodados para realizar o frete: ");
		double distancia = scanner.nextDouble();
		System.out.println("O preço aproximado do frete será de R$" + distancia*7.87 + ".");
	}
}
