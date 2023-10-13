import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] e3 = new int[10];
		int somaPositivos = 0;
		int somaNegativos = 0;
		
		for(int i = 0; i < e3.length; i++) {
			System.out.println("Digite um número inteiro: ");
			int valor = teclado.nextInt();
			if(valor > 0) {
				somaPositivos++;
			}
			if(valor < 0) {
				somaNegativos++;
			}
			e3[i] = valor;
		}
		
		int[] positivos = new int[somaPositivos];
		int[] negativos = new int[somaNegativos];
		int p = 0;
		int n = 0;
		
		for(int i = 0; i < e3.length; i++) {
			if(e3[i] > 0) {
				
				positivos[p] = e3[i];
				p++;
			}
			if(e3[i] < 0) {
				negativos[n] = e3[i];
				n++;
					}
				}
			
		
		
		System.out.println("");
		System.out.print("V = [");
		for(int i = 0; i < e3.length; i++) {
			if(i == e3.length - 1) {
				System.out.print(e3[i] + "]");
			}
			else {
				System.out.print(e3[i] + ", ");
			}
		}
		
		System.out.println("");
		System.out.print("P = [");
		for(int i = 0; i < positivos.length; i++) {
			if(i == positivos.length - 1) {
				System.out.print(positivos[i] + "]");
			}
			else {
				System.out.print(positivos[i] + ", ");
			}
		}
		
		System.out.println("");
		System.out.print("N = [");
		for(int i = 0; i < negativos.length; i++) {
			if(i == negativos.length - 1) {
				System.out.print(negativos[i] + "]");
			}
			else {
				System.out.print(negativos[i] + ", ");
			}
		}

		teclado.close();
		
	}
}