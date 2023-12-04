import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        ArrayList<Livro> arrei = new ArrayList<>();
        arrei.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1612, "5"));
        arrei.add(new Livro("Um Conto de Duas Cidades", "Charles Dickens", 1859, "4"));
        arrei.add(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "6"));
        arrei.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "3"));
        arrei.add(new Livro("O Hobbit", "J. R. R. Tolkien", 1937, "2"));
        arrei.add(new Livro("O Caso dos Dez Negrinhos", "Agatha Christie", 1939, "1"));
        arrei.add(new Livro("O Sonho da Câmara Vermelha", "Cao Xueqin", 1754, "7"));

        Collections.sort(arrei);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de ISBN para pesquisar: ");
        String numero = scanner.nextLine();

        int posicao = pesquisaBinária(arrei, numero);

        if (posicao != -1) {
            System.out.println("O livro com ISBN igual à " + numero + " é o \n" + arrei.get(posicao).toString() + " e foi encontrado na posição " + posicao + ".");
        } else {
                System.out.println("O livro com ISBN igual à " + numero + " não foi encontrado.");
        }

        scanner.close();

    }

    private static int pesquisaBinária(ArrayList<Livro> arrei, String numero) {
        int inicio = 0;
        int fim = arrei.size() - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            int comparacao = arrei.get(meio).getIsbn().compareTo(numero);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    
}
