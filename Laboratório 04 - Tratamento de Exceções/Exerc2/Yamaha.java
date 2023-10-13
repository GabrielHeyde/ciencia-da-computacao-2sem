public class Yamaha extends Veículo {
	
	private int velocidadeMaxima;
	private int nPassageirosMaximos;
	
	public Yamaha(int velocidade, int nPassageiros) {
		super(velocidade, nPassageiros);
		this.velocidadeMaxima = 350;
		this.nPassageirosMaximos = 2;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getnPassageirosMaximos() {
		return nPassageirosMaximos;
	}

}
