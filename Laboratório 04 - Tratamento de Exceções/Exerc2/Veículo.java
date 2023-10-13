public abstract class Veículo {
	
	private int velocidade;
	private int nPassageiros;
	
	public Veículo(int velocidade, int nPassageiros) {
		super();
		this.velocidade = velocidade;
		this.nPassageiros = nPassageiros;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public int getnPassageiros() {
		return nPassageiros;
	}
	
	public void acelerar(int maisVelocidade) {
		this.velocidade = getVelocidade() + maisVelocidade;
	}
	
	public void frear(int menosVelocidade) {
		this.velocidade = getVelocidade() + menosVelocidade;
	}
	
	public void adPassageiros(int passageiros) {
		this.nPassageiros = getnPassageiros() + passageiros;
	}
}
