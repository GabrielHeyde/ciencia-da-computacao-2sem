
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Exercício2 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Digite a quantidade de nomes que você deseja adicionar à lista: ");
		int qNomes = scanner.nextInt();
		
		for (int i = 0; i < qNomes; i++) {
			System.out.println("Digite o nome que você deseja adicionar em sua lista: ");
			nomes.add(scanner.next());
		}
		
		while(true) {

			System.out.println("Menu: ");
			System.out.println("1. Adicionar");
			System.out.println("2. Recuperar uma posição");
			System.out.println("3. Atualizar");
			System.out.println("4. Exibir lista");
			System.out.println("5. Remover Terceiro Nome");
			System.out.println("6. Buscar Nome");
			System.out.println("7. Ordenar Lista");
			System.out.println("8. Copiar Lista");
			System.out.println("9. Sair");

			System.out.println("Digite a opção desejada: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite um nome: ");
				String nome = scanner.next();
				nomes.add(nome);
				break;
			case 2:
				System.out.println("Informe a posiçãoo para consultar(0 até " + (nomes.size()-1) + "): ");
				int posicao = scanner.nextInt();
				System.out.println("Cor na posição " + posicao + ": " + nomes.get(posicao));
				break;
			case 3:
				System.out.println("Digite um número para atualizar uma posição(0 até " + (nomes.size()-1) + "):");
				int posAtu = scanner.nextInt();
				System.out.println("Digite um novo nome: ");
				String novoNome = scanner.next();
				nomes.set(posAtu, novoNome);
				break;
			case 4:
				for (String pessoas : nomes) {
					System.out.println(pessoas);
				}
				break;
			case 5:
				nomes.remove(2);
				System.out.println("Terceiro nome removido com sucesso!");
				break;
			case 6:
				System.out.println("Digite o nome que você deseja buscar na lista: ");
				String buscaNome = scanner.next();
				boolean busca = nomes.contains(buscaNome);
				if(busca == true) {
					System.out.println("Este nome está presente na lista!");
				}
				else {
					System.out.println("Este nome NÃO está na lista!");
				}
				break;
			case 7:
				Collections.sort(nomes);
				System.out.println("Lista ordenada com sucesso!");
				break;
			case 8:
				System.out.println("Informe a posição inicial: ");
				int posUni = scanner.nextInt();
				System.out.println("Informe a posição final: ");
				int posFim = scanner.nextInt();
				List<String> parte = nomes.subList(posUni, posFim);
				System.out.println("Parte da lista");
				break;
			case 9:
				System.out.println("Finalizando programa");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Opção inválida!");
			}

		}
	}

}
