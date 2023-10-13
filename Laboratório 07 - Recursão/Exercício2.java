
import javax.swing.JOptionPane;

public class Exercício2 {
	
	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
		
		if(verificaPalindromo(palavra)) {
			System.out.println("A Palavra " + palavra + " é um palíndromo.");
		}
		else {
			System.out.println("A palavra " + palavra + " não é um palíndromo.");
		}
	}

	private static boolean verificaPalindromo(String palavra) {
		
		palavra = palavra.toLowerCase();
		
		int comprimento = palavra.length();
		
		for(int i = 0; i < comprimento / 2; i++) {
			if(palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
				return false;
			}
		}
		
		return true;
	}

}