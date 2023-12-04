public class QuickSort{

    public static void main(String[] args) {
        
        int[] arrei = {12, 4, 5, 6, 7, 3, 1, 15};

        System.out.println("Array Original: ");
        exibirArray(arrei);

        quickSort(arrei);

        System.out.println("Array ordenado: ");
        exibirArray(arrei);

    }

    private static void quickSort(int[] arrei) {
        if (arrei == null || arrei.length == 0) {
            return;
        }

        int tamanho = arrei.length;
        quicksortRecursivo(arrei, 0, tamanho - 1);
    
    }

    private static void quicksortRecursivo(int[] arrei, int inicio, int fim){
        int i = inicio;
        int j = fim;

        int pivo = arrei[(inicio + fim) /2];

        while(i <= j){
            while(arrei[i] < pivo){
                i++;
            }
            while (arrei[j] > pivo){
                j--;
            }
            if(i <= j){
                trocarElementos(arrei, i, j);
                i++;
                j--;
            }

        }

        if(inicio < j){
            quicksortRecursivo(arrei, inicio, j);
        }
        if (i < fim) {
            quicksortRecursivo(arrei, i, fim);
        }

    }

    private static void trocarElementos(int[] arrei, int i, int j) {
        int temp = arrei[i];
        arrei[i] = arrei[j];
        arrei[j] = temp;
    }

    private static void exibirArray(int[] arrei){
        for (int valor : arrei) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}