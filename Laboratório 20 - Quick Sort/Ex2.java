public class Ex2{

    public static void main(String[] args) {
        
        Produto[] arrei = {
            new Produto("Amaciante", 20.99),
            new Produto("Detergente", 2.29),
            new Produto("Cookie", 5.99),
            new Produto("Arroz", 5.29),
            new Produto("Feijão", 7.49),
            new Produto("Açúcar", 3.50),

        };

        System.out.println("Array Original: ");
        exibirArray(arrei);

        quickSort(arrei);

        System.out.println("Array ordenado: ");
        exibirArray(arrei);

    }

    private static void quickSort(Produto[] arrei) {
        if (arrei == null || arrei.length == 0) {
            return;
        }

        int tamanho = arrei.length;
        quicksortRecursivo(arrei, 0, tamanho - 1);
    
    }

    private static void quicksortRecursivo(Produto[] arrei, int inicio, int fim){
        int i = inicio;
        int j = fim;

        Produto pivo = arrei[(inicio + fim) /2];

        while(i <= j){
            while(arrei[i].getPreco() < pivo.getPreco()){
                i++;
            }
            while (arrei[j].getPreco() > pivo.getPreco()){
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

    private static void trocarElementos(Produto[] arrei, int i, int j) {
        Produto temp = arrei[i];
        arrei[i] = arrei[j];
        arrei[j] = temp;
    }

    private static void exibirArray(Produto[] arrei){
        for (Produto valor : arrei) {
            System.out.println(valor.toString());
        }
        System.out.println();
    }
}