
import javax.swing.JOptionPane;

public class Excercício1 {
	
	public static void main(String[] args) {
		
		String nro = JOptionPane.showInputDialog("Informe a base da potência: ");
		long base = Long.parseLong(nro);
		
		String exp = JOptionPane.showInputDialog("Informe o expoente da potência: ");
		long expoente = Long.parseLong(exp);
		
		long resultado = potencia(base, expoente);
			System.out.println("Número: " + base + " elevado a " + expoente + " é igual a "+ resultado);
		}
	

	private static long potencia(long base, long expoente) {
		if(expoente == 0) {
			return 1;
		}
		else {
			return base * potencia(base, expoente - 1);
		}
	}
}