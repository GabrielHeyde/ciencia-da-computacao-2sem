
public class ExemploBubbleSort {

    public static void main(String[] args) {

        int[] arrei = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Array Original: ");

        imprimirArrei(arrei);

        ordenarPorBubbleSort(arrei);

        System.out.println("\nArrei ordenado em ordem crescente!");

        imprimirArrei(arrei);
    }

    private static void ordenarPorBubbleSort(int[] arrei) {

        int tamanho = arrei.length;
        boolean trocado;

        do {
            trocado = false;
            for (int i = 1; i < tamanho; i++) {
                if (arrei[i - 1] > arrei[i]) {
                    int temp = arrei[i - 1];
                    arrei[i - 1] = arrei[i];
                    arrei[i] = temp;
                    trocado = true;
                }
            }
            tamanho--;
        } while (trocado);
    }

    private static void imprimirArrei(int[] arrei) {
        for (int i : arrei) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}