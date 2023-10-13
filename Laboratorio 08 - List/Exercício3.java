
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class Exercício3 {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Digite a quantidade de frutas que você deseja adicionar a sua lista: ");
		int qFrutas = scanner.nextInt();
		
		for (int i = 0; i < qFrutas; i++) {
			System.out.println("Digite a fruta que você deseja adicionar em sua lista: ");
			frutas.add(scanner.next());
		}
		
		ArrayList<String> frutasProntas = new ArrayList<String>();
		frutasProntas.add("Banana");
		frutasProntas.add("Maçã");
		frutasProntas.add("Morango");
		frutasProntas.add("Melancia");
		frutasProntas.add("Laranja");
		frutasProntas.add("Pêra");
		frutasProntas.add("Uva");
		frutasProntas.add("Kiwi");
		frutasProntas.add("Mamão");
		frutasProntas.add("Manga");

				
		while(true) {

			System.out.println("Menu: ");
			System.out.println("1. Adicionar");
			System.out.println("2. Embaralhar a Lista de Frutas");
			System.out.println("3. Fracionar Lista");
			System.out.println("4. Exibir lista");
			System.out.println("5. Compara com a lista padrão");
			System.out.println("6. Trocar frutas de posição");
			System.out.println("7. Ordenar Lista");
			System.out.println("8. Juntas Listas");
			System.out.println("9. Sair");

			System.out.println("Digite a opção desejada: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite uma fruta: ");
				String nome = scanner.next();
				frutas.add(nome);
				break;
			case 2:
				Collections.shuffle(frutas);
				System.out.println("Lista embaralhada com sucesso!");
				break;
			case 3:
				System.out.println("Digite a primeira posição do corte da lista: ");
				int pValor = scanner.nextInt();
				System.out.println("Digite a última posição do corte da lista: ");
				int uValor = scanner.nextInt();
				List<String> parteFrutas = frutas.subList(pValor, uValor);
				System.out.println("Lista fracionada com sucesso!");
				for (String fruta : parteFrutas) {
					System.out.println(fruta);
				}
				break;
			case 4:
				for (String fruta : frutas) {
					System.out.println(fruta);
				}
				break;
			case 5:
				for (int i = 0; i < frutasProntas.size(); i++) {
					for (int j = 0; j < frutas.size(); j++) {
						if(frutasProntas.get(i).equals(frutas.get(j))) {
							System.out.println(frutasProntas.get(i) + " está presente nas duas listas!");
						}
					}
				}
				break;
			case 6:
				System.out.println("Digite a posição da primeira fruta que você deseja trocar de posição: ");
				int primeiraPosicao = scanner.nextInt();
				System.out.println("Digite a posição da segunda fruta que você deseja trocar de posição: ");
				int segundaPosicao = scanner.nextInt();
				Collections.swap(frutas, primeiraPosicao, segundaPosicao);
				System.out.println("Troca realizada com sucesso!");
				break;
			case 7:
				Collections.sort(frutas);
				System.out.println("Lista ordenada com sucesso!");
				break;
			case 8:
				frutas.addAll(frutasProntas);
				System.out.println("Frutas da lista padrão adicionadas com sucesso ao final da sua lista original!");
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
