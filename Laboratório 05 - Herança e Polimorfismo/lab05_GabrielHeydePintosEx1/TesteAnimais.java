public class TesteAnimais {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.fazerBarulho();
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerBarulho();
		
		Animal gato = new Gato();
		gato.fazerBarulho();
		
		gato = cachorro;
		gato.fazerBarulho();
		
	}

}