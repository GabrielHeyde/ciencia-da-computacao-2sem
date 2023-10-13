import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double[][] e5 = new double[3][3];
		
		for (int i = 0; i < e5.length; i++) {
			for (int j = 0; j < e5[i].length; j++) {
				System.out.println("Digite o valor que você deseja adicionar à matriz na posição [" + i + "][" + j + "]");
				e5[i][j] = teclado.nextDouble();}}
		
		teclado.close();
		
		
		
		System.out.println(retornaMatriz(e5));
			
		}
		
		public static String retornaMatriz(double[][] e5) {
			String matrizString = "";
			
			for (int i = 0; i < e5.length; i++) {
				for (int j = 0; j < e5[i].length; j++) {
					matrizString = matrizString + " " + e5[i][j];
					}
				matrizString = matrizString + "\n";
				}
			
			return matrizString;
			
			
		}
}