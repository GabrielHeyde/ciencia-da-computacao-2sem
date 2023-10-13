public class LandRover extends Veículo {
	
	private int velocidadeMaxima;
	private int nPassageirosMaximos;
	
	public LandRover(int velocidade, int nPassageiros) {
		super(velocidade, nPassageiros);
		this.velocidadeMaxima = 250;
		this.nPassageirosMaximos = 5;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getnPassageirosMaximos() {
		return nPassageirosMaximos;
	}
	

}
