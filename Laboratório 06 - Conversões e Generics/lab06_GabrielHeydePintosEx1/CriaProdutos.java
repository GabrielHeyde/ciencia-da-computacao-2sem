
import java.util.Scanner;

public class CriaProdutos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de produtos que serão criados: ");
		Produto[] produtos = new Produto[scanner.nextInt()];
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Digite o nome que você deseja adicionar ao produto: ");
			String nome = scanner.next();
			System.out.println("Digite o preço que você deseja atribuir ao produto: ");
			double preco = scanner.nextDouble();
			Produto p0 = new Produto(nome, preco);
			produtos[i] = p0;
			
		}
				
		for (int i = 0; i < produtos.length; i++) {
			String precoS = String.valueOf(produtos[i].getPreco());
			System.out.println("Nome do Produto: " + produtos[i].getNome() + "\nPreço do Produto: R$" + precoS);
		}
		
		
		System.out.println("Digite o percentual de reajuste que será atribuido ao seu produto: ");
		double percentual = scanner.nextDouble();
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].setPreco(produtos[i].getPreco() + produtos[i].getPreco()* (percentual/100));
			System.out.println("Nome do Produto: " + produtos[i].getNome() + "\nPreço do Produto reajustado: R$" + produtos[i].getPreco());
		}
		
		scanner.close();
	}

}