public class Ex1 {

    public static void main(String[] args) {

        String[] arrei = { "Bará", "Ogum", "Iansã", "Xangô", "Odé", "Otim", "Obá", "Ossanha", "Xapanã", "Oxum",
                "Iemanjá", "Oxalá" };

        System.out.println("Array Original: ");
        exibirArray(arrei);

        quickSort(arrei);

        System.out.println("Array ordenado: ");
        exibirArray(arrei);

    }

    private static void quickSort(String[] arrei) {
        if (arrei == null || arrei.length == 0) {
            return;
        }

        int tamanho = arrei.length;
        quicksortRecursivo(arrei, 0, tamanho - 1);

    }

    private static void quicksortRecursivo(String[] arrei, int inicio, int fim) {
        int i = inicio;
        int j = fim;

        String pivo = arrei[(inicio + fim) / 2];

        while (i <= j) {
            while (arrei[i].length() < pivo.length()) {
                i++;
            }
            while (arrei[j].length() > pivo.length()) {
                j--;
            }
            if (i <= j) {
                trocarElementos(arrei, i, j);
                i++;
                j--;
            }

        }

        if (inicio < j) {
            quicksortRecursivo(arrei, inicio, j);
        }
        if (i < fim) {
            quicksortRecursivo(arrei, i, fim);
        }

    }

    private static void trocarElementos(String[] arrei, int i, int j) {
        String temp = arrei[i];
        arrei[i] = arrei[j];
        arrei[j] = temp;
    }

    private static void exibirArray(String[] arrei) {
        for (String valor : arrei) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
