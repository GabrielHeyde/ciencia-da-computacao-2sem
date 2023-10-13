import java.util.Scanner;

public class Manobrista {

	public static void main(String[] args) throws VelocidadeMaximaExcepted, NumeroDePassageirosExcepted{
		
		Scanner teclado = new Scanner(System.in);
		
		LandRover landRover = new LandRover(100, 0);
		Porsche porsche = new Porsche(100,0);
		Yamaha yamaha = new Yamaha(100,0);
		
		try {
			System.out.println("Digite o quanto você deseja acelerar a sua Land Rover: ");
			int vlr = teclado.nextInt();
			landRover.acelerar(vlr);
			if(landRover.getVelocidade() > landRover.getVelocidadeMaxima()) {
				throw new VelocidadeMaximaExcepted("Falha! A velocidade máxima da Land Rover é de " + landRover.getVelocidadeMaxima());
			}
		}
		catch(VelocidadeMaximaExcepted e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite quantas pessoas você deseja adicionar na sua Land Rover: ");
			int plr = teclado.nextInt();
			landRover.adPassageiros(plr);
			if(landRover.getnPassageiros() > landRover.getnPassageirosMaximos()) {
				throw new NumeroDePassageirosExcepted("Falha! O número máximo de passageiros da Land Rover é de " + landRover.getnPassageirosMaximos());
			}
		}
		catch(NumeroDePassageirosExcepted e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite o quanto você deseja acelerar a sua Porsche: ");
			int vp = teclado.nextInt();
			porsche.acelerar(vp);
			if(porsche.getVelocidade() > porsche.getVelocidadeMaxima()) {
				throw new VelocidadeMaximaExcepted("Falha! A velocidade máxima da Porsche é de " + porsche.getVelocidadeMaxima());
			}
		}
		catch(VelocidadeMaximaExcepted e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite quantas pessoas você deseja adicionar na sua Porsche: ");
			int ppr = teclado.nextInt();
			porsche.adPassageiros(ppr);
			if(porsche.getnPassageiros() > porsche.getnPassageirosMaximos()) {
				throw new NumeroDePassageirosExcepted("Falha! O número máximo de passageiros da Porsche é de " + porsche.getnPassageirosMaximos());
			}
		}
		catch(NumeroDePassageirosExcepted e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite o quanto você deseja acelerar a sua Yamaha: ");
			int vyh = teclado.nextInt();
			yamaha.acelerar(vyh);
			if(yamaha.getVelocidade() > yamaha.getVelocidadeMaxima()) {
				throw new VelocidadeMaximaExcepted("Falha! A velocidade máxima da Yamaha é de " + yamaha.getVelocidadeMaxima());
			}
		}
		catch(VelocidadeMaximaExcepted e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			System.out.println("Digite quantas pessoas você deseja adicionar na sua Yamaha: ");
			int pyh = teclado.nextInt();
			yamaha.adPassageiros(pyh);
			if(yamaha.getnPassageiros() > yamaha.getnPassageirosMaximos()) {
				throw new NumeroDePassageirosExcepted("Falha! O número máximo de passageiros da Yamaha é de " + yamaha.getnPassageirosMaximos());
			}
		}
		catch(NumeroDePassageirosExcepted e) {
			System.out.println("Erro: " + e.getMessage());
		}

		
		teclado.close();
	}

}
