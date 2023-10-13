
import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o tamanho do array: ");
		int tamanho = scanner.nextInt();
		int[] arrei = new int[tamanho];

		System.out.println("Informe os números do array: ");
		for (int i = 0; i < arrei.length; i++) {
			arrei[i] = scanner.nextInt();
		}

		int menorElemento = procuraMenorElemento(arrei, 0);
		System.out.println("O menor elemento do arrei �: " + menorElemento);

		scanner.close();

	}

	private static int procuraMenorElemento(int[] arrei, int indice) {

		if(indice == arrei.length - 1) {
			return arrei[indice];
		}

		int menorRestante = procuraMenorElemento(arrei, indice + 1);

		return Math.min(arrei[indice], menorRestante);

	}
}