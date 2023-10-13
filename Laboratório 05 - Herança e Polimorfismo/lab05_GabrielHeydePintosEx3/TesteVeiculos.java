
public class TesteVeiculos {

	public static void main(String[] args) {
		Veiculo[] veiculo= new Veiculo[10];
		
		for (int i = 0; i < veiculo.length; i++) {
			if(i == 0 || i == 9) {
				veiculo[i] = new Caminhão("Unisinos", "GHP", 2023);
			}
			else if(i == 1 || i == 3 || i == 5 || i == 7) {
				veiculo[i] = new Carro("Unisinos", "GHP", 2023);
			}
			
			else {
				veiculo[i] = new Moto("Unisinos", "GHP", 2023);
			}
		}

		for (int i = 0; i < veiculo.length; i++) {
			if(veiculo[i] instanceof Carro) {
				System.out.println("Veículo["+i+"] == Carro");
				Carro x = (Carro) veiculo[i];
				x.precoDaViagem();
				System.out.println("");
			}
			else if(veiculo[i] instanceof Moto) {
				System.out.println("Veículo["+i+"] == Moto");
				Moto y = (Moto) veiculo[i];
				y.empinar();
				System.out.println("");
			}
			else if(veiculo[i] instanceof Caminhão) {
				System.out.println("Veículo["+i+"] == Caminhão");
				Caminhão z = (Caminhão) veiculo[i];
				z.frete();
				System.out.println("");
				}
		}
	}

}