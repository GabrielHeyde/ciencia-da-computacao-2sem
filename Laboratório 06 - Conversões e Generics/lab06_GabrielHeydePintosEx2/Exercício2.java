
public class Exercício2 {

	public static void main(String[] args) {
		Par<Integer, String> par1 = new Par<>(23, "Gabriel");
		Par<Double, Boolean> par2 = new Par<>(23.10, true);
		Par<Character, String> par3 = new Par<>('o', "Gabriel");
		Par<Integer, Character> par4 = new Par<>(2, 'Y');
		Par<Integer, Double> par5 = new Par<>(23, 23.0);

		System.out.println("Pares criados: ");
		System.out.println("Par 1: " + par1.getFirst() + " / " + par1.getSecond());
		System.out.println("Par 1: " + par2.getFirst() + " / " + par2.getSecond());
		System.out.println("Par 1: " + par3.getFirst() + " / " + par3.getSecond());
		System.out.println("Par 1: " + par4.getFirst() + " / " + par4.getSecond());
		System.out.println("Par 1: " + par5.getFirst() + " / " + par5.getSecond());

	}

}
