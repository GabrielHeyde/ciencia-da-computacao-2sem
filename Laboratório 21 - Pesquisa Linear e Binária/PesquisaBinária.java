import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinária {

    public static void main(String[] args) {

        int[] arrei = { 10, 5, 8, 2, 7, 1, 3, 6, 9, 4 };

        Arrays.sort(arrei);

        System.out.println("Array ordenado: ");
        for (int i : arrei) {
            System.out.print(i + " ");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nInforme um número para pesquisar: ");
        int numero = scanner.nextInt();

        int posicao = pesquisaBinária(arrei, numero);

        if (posicao != -1) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O número " + numero + " não foi encontrado.");
        }

        scanner.close();

    }

    private static int pesquisaBinária(int[] arrei, int numero) {
        int inicio = 0;
        int fim = arrei.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (arrei[meio] == numero) {
                return meio;
            } else if (arrei[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
