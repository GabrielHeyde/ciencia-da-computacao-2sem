import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] e2 = new String[7];
		
		for(int i = 0; i< e2.length; i++){
			System.out.println("Digite um nome para ser adicionado ao vetor: ");
			String nome = teclado.next();
			while(nome.length()>15) {
				System.out.println("Erro! Digite um nome com até 15 caracteres: ");
				nome = teclado.next();
			}
			e2[i] = nome;
		}
		System.out.println("\nLista de nomes de trás para frente: ");
		for(int i = e2.length - 1;i>=0;i--) {
			System.out.println(e2[i]);
		}

		teclado.close();

	}

}
