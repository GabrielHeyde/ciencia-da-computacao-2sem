
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercício1 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		while(true) {

			System.out.println("Menu: ");
			System.out.println("1. Adicionar");
			System.out.println("2. Inserir na primeira posição");
			System.out.println("3. Recuperar uma posição");
			System.out.println("4. Atualizar");
			System.out.println("5. Exibir lista");
			System.out.println("6. Copiar lista");
			System.out.println("7. Ordenar lista");
			System.out.println("8. Inverter lista");
			System.out.println("9. Copiar parte da lista");
			System.out.println("0. Sair");

			System.out.println("Digite a opção desejada: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite uma cor: ");
				String cor = scanner.next();
				lista.add(cor);
				break;
			case 2:
				System.out.println("Digite uma cor para a primeira posição: ");
				String corPrimPos = scanner.next();
				lista.add(0, corPrimPos);
				break;
			case 3:
				System.out.println("Informe a posição para consultar(0 até " + (lista.size()-1) + "): ");
				int posicao = scanner.nextInt();
				System.out.println("Cor na posição " + posicao + ": " + lista.get(posicao));
				break;
			case 4:
				System.out.println("Digite uma cor para atualizar uma posição(0 até " + (lista.size()-1) + "):");
				int posAtu = scanner.nextInt();
				System.out.println("Digite a nova cor: ");
				String novaCor = scanner.next();
				lista.set(posAtu, novaCor);
				break;
			case 5:
				for (String rgb : lista) {
					System.out.println(rgb);
				}
				break;
				
			case 6:
				ArrayList<String> listaCopiada = new ArrayList<String>(lista.size());
				listaCopiada.addAll(lista);
				System.out.println("Lista copiada com sucesso!");
				break;
				
			case 7:
				Collections.sort(lista);
				System.out.println("Lista ordenada com sucesso!");
				break;
				
			case 8:
				Collections.reverse(lista);
				System.out.println("Lista invertida com sucesso!");
				break;
				
			case 9:
				System.out.println("Informe a posição inicial: ");
				int posUni = scanner.nextInt();
				System.out.println("Informe a posição final: ");
				int posFim = scanner.nextInt();
				List<String> parte = lista.subList(posUni, posFim);
				System.out.println("Parte da lista");
				break;
				
			case 0:
				System.out.println("Finalizando programa");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Opção inválida!");
			}

		}
	}

}
