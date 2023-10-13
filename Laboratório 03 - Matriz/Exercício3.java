
public class Exercício3 {
	
	public static void main(String[] args) {
		
		int[][] e3 = new int[5][5];
		
		for(int i = 0;i < e3.length; i++) {
			for(int j = 0;j < e3[i].length; j++) {
				int valor = (int) (Math.random() * 99);
				e3[i][j] = valor;
			}
		}
		
		for(int i = 0; i < e3.length; i++) {
			System.out.println("");
			for(int j = 0; j < e3[i].length; j++) {
				System.out.print(e3[i][j] + " ");
			}
		}
	}
}