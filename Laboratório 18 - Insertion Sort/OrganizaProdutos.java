public class OrganizaProdutos {

    public static void main(String[] args) {

        Produto[] produtos = {
                new Produto("Chapinha", 250),
                new Produto("Air Fryer", 600),
                new Produto("Aspirador de pó", 1700),
                new Produto("Album Taylor Swift", 60.99),
                new Produto("Livro - Vermelho Branco e Sangue Azul", 30.81),

        };

        System.out.println("Array original");

        imprimirArrei(produtos);

        insertionSort(produtos);

        System.out.println("\nArray ordenado: ");

        imprimirArrei(produtos);

    }

    private static void imprimirArrei(Produto[] produtos) {
        System.out.print("[");
        for (int i = 0; i < produtos.length; i++) {
            if (i == produtos.length - 1) {
                System.out.print(produtos[i].toString() + "]");
            } else {
                System.out.print(produtos[i].toString() + ", ");
            }
        }

    }

    private static void insertionSort(Produto[] produtos) {

        int tamanho = produtos.length;

        for (int i = 1; i < tamanho; i++) {
            Produto chave = produtos[i];
            int j = i - 1;

            while (j >= 0 && produtos[j].getPreco() > chave.getPreco()) {
                produtos[j + 1] = produtos[j];
                j--;
            }

            produtos[j + 1] = chave;
        }
    }

}