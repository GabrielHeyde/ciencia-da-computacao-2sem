
import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do array: ");
		int tamanho = scanner.nextInt();
		int[] arrei = new int[tamanho];

		System.out.println("Informe os números do array: ");
		for (int i = 0; i < arrei.length; i++) {
			arrei[i] = scanner.nextInt();
		}
		
		System.out.println("Imprimindo o array: ");
		imprimirArreiRecursivo(arrei, 0);
		
		scanner.close();



	}

	private static void imprimirArreiRecursivo(int[] arrei, int indice) {
		
		if(indice == arrei.length) {
			return;
		}
		
		System.out.print(arrei[indice] + " ");
		
		imprimirArreiRecursivo(arrei, indice + 1);
		
	}

}
