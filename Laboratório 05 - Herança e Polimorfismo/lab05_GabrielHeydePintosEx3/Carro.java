import java.util.Scanner;

public class Carro extends Veiculo {
	
	Scanner scanner = new Scanner(System.in);

	private int qPessoas;
	private String cor;
	private double consumoKm;
	
	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
		this.qPessoas = qPessoas;
		this.cor = cor;
		this.consumoKm = consumoKm;
	}

	public int getqPessoas() {
		return qPessoas;
	}

	public void setqPessoas(int qPessoas) {
		this.qPessoas = qPessoas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getConsumoKm() {
		return consumoKm;
	}

	public void setConsumoKm(double consumoKm) {
		this.consumoKm = consumoKm;
	}
	
	public void precoDaViagem() {
		System.out.println("Digite o número de pessoas que irá nesta viagem: ");
		setqPessoas(scanner.nextInt());
		System.out.println("Digite quantos kilometros serão viajados por você: ");
		double km = scanner.nextDouble();
		System.out.println("Digite quantos kilometros por Litro faz o seu carro: ");
		setConsumoKm(scanner.nextDouble());
		System.out.println("Desta forma, cada pessoa no carro deverá por o equivalente à " + (km/getConsumoKm())/getqPessoas() + " litros de gasolina.");
	}

}
