public class Porsche extends Veículo {

	private int velocidadeMaxima;
	private int nPassageirosMaximos;
	
	public Porsche(int velocidade, int nPassageiros) {
		super(velocidade, nPassageiros);
		this.velocidadeMaxima = 300;
		this.nPassageirosMaximos = 2;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public int getnPassageirosMaximos() {
		return nPassageirosMaximos;
	}
	
	
}
