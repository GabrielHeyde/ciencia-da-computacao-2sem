import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] e1 = new int[8];
		
		int somaDosValores = 0;
		int somaPositivos = 0;
		
		for(int i = 0; i < e1.length; i++) {
			System.out.println("Digite um número para ser adicionado ao vetor");
			e1[i] = teclado.nextInt();
			somaDosValores = somaDosValores + e1[i];
			if(somaDosValores > 0) {
				somaPositivos++;
			}
		}
		
		System.out.println("");
		System.out.print("[");
		for(int i = 0; i < e1.length; i++) {
			if(i == e1.length - 1) {
				System.out.print(e1[i] + "]");
			}
			else {
				System.out.print(e1[i] + ", ");
			}
		}
		
		System.out.println("\nA soma dos valores dos elementos no vetor é de: " + somaDosValores);
		System.out.println("Existem " + somaPositivos + " elementos positivos no array");

		teclado.close();
	}
}