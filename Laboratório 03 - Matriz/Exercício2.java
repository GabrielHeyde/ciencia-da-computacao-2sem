
public class Exercício2 {
	
	public static void main(String[] args) {
		
		int[][] e1 = new int[5][10];
		
		for(int i = 0; i < e1.length; i++) {
			for(int j = 0; j < e1[i].length; j++) {
				e1[i][j] = j*j;
			}
		}
		
		for(int i = 0; i < e1.length; i++) {
			System.out.println("");
			for(int j = 0; j < e1[i].length; j++) {
				System.out.print(e1[i][j] + " ");
			}
		}
	}
}