public class PessoaMergeSort {

    public static void mergeSort(Pessoa[] arrei, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arrei, left, middle);
            mergeSort(arrei, middle + 1, right);

            merge(arrei, left, middle, right);
        }
    }

    public static void merge(Pessoa[] arrei, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        Pessoa[] arreiEsquerdo = new Pessoa[n1];
        Pessoa[] arreiDireito = new Pessoa[n2];

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
            if (arreiEsquerdo[i].getIdade() <= arreiDireito[j].getIdade()) {
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

    public static void imprimirArray(Pessoa[] arrei) {
        for (Pessoa valor : arrei) {
            System.out.println(valor.toString() + " ");
        }

        System.out.println();
    }

}
