public class MergeSort {

    public static void main(String[] args) {

        int[] arrei = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array Original: ");

        imprimirArray(arrei);

        mergeSort(arrei, 0, arrei.length - 1);

        System.out.println("\nArray Ordenado: ");
        imprimirArray(arrei);

    }

    /*
     * Método que realiza a ordenação por merge sort
     * @param arrei
     * @param left índice do lado esquerdo
     * @param right índice do lado direito
     */
    private static void mergeSort(int[] arrei, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arrei, left, middle);
            mergeSort(arrei, middle + 1, right);

            merge(arrei, left, middle, right);
        }
    }

    private static void merge(int[] arrei, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] arreiEsquerdo = new int[n1];
        int[] arreiDireito = new int[n2];

        // copiando dados para os arrays temporários
        for (int i = 0; i < n1; ++i) {
            arreiEsquerdo[i] = arrei[left + i];

        }
        for (int j = 0; j < n2; ++j) {
            arreiDireito[j] = arrei[middle + 1 + j];
        }

        // mesclando os arrays temporários
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (arreiEsquerdo[i] <= arreiDireito[j]) {
                arrei[k] = arreiEsquerdo[i];
                i++;
            } else {
                arrei[k] = arreiDireito[j];
                j++;
            }
            k++;
        }

        // copiando os itens restantes do lado esquerdo
        while (i < n1) {
            arrei[k] = arreiEsquerdo[i];
            i++;
            k++;
        }

        // copiando os itens restantes do lado direito
        while (j < n2) {
            arrei[k] = arreiDireito[j];
            j++;
            k++;
        }
    }

    private static void imprimirArray(int[] arrei) {
        for (int valor : arrei) {
            System.out.print(valor + " ");
        }

        System.out.println();
    }

}