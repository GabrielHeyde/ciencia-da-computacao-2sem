import java.util.Scanner;

public class PesquisaLinear {

    public static void main(String[] args) {

        int[] arrei = { 10, 5, 8, 2, 7, 1, 3, 6, 9, 4 };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para pesquisar: ");
        int numero = scanner.nextInt();

        int posicao = pesquisaLinear(arrei, numero);

        if (posicao != -1) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O número " + numero + " não foi encontrado.");
        }

        scanner.close();

    }

    private static int pesquisaLinear(int[] arrei, int numero) {
        for (int i = 0; i < arrei.length; i++) {
            if (arrei[i] == numero) {
                return i;
            }
        }
        return -1;
    }

}