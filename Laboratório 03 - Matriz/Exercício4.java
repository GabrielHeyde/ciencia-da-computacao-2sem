
import java.util.Scanner;

public class Exercício4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[][] e4 = new double[2][5];
		
		for(int i = 0; i < e4.length; i++) {
			for(int j = 0;j < e4[i].length; j++) {
				System.out.println("Digite o valor que você deseja adicionar à posição [" + i + "][" + j + "] da matriz: ");
				e4[i][j] = teclado.nextDouble();
			}
		}
		
		teclado.close();
		
		for(int i = 0; i < e4.length; i++) {
			System.out.println("");
			for(int j = 0; j < e4[i].length; j++) {
				System.out.print(e4[i][j] + " ");
			}
		}		
	}
}