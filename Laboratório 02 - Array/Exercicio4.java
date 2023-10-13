import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int[] e4 = new int[10];
		
		for(int i = 0; i < e4.length; i++) {
			System.out.println("Digite um valor para ser adicionado ao array: ");
			e4[i] = teclado.nextInt();
		}
		
		System.out.print("\n[");
		for(int i = 0; i < e4.length; i++) {
			if(i == e4.length - 1) {
				System.out.print(e4[i] + "]");
			}
			else {
				System.out.print(e4[i] + ", ");
			}
		}
		
		for(int i = 0; i < e4.length; i = i + 2) {
			int salvaValor = e4[i];
			e4[i] = e4[i+1];
			e4[i+1] = salvaValor;
		}
		
		System.out.print("\n[");
		for(int i = 0; i < e4.length; i++) {
			if(i == e4.length - 1) {
				System.out.print(e4[i] + "]");
			}
			else {
				System.out.print(e4[i] + ", ");
			}
		}

		teclado.close();
	}

}