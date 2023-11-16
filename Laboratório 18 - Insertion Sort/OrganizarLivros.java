public class OrganizarLivros {

    public static void main(String[] args) {

        Livro[] livros = {
                new Livro("Diário de um Banana: A Verdade Nua e Crua", 42.58, 2010),
                new Livro("Diário de um Banana: A Gota d'Água", 28.78, 2009),
                new Livro("Diário de um Banana: O LIVRO", 41.21, 2008),
                new Livro("Diário de um Banana: Rodrick é o Cara", 36.49, 2008),
                new Livro("Diário de um Banana: Casa dos Horrores", 35.37, 2012),
                new Livro("Diário de um Banana: Dias de Cão", 60.44, 2009)
        };

        System.out.println("Array original:");
        imprimirArray(livros);

        LivroOrdenacao.insertionSort(livros);

        System.out.println("\nArray ordenado:");
        imprimirArray(livros);
    }

    private static void imprimirArray(Livro[] livros) {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println();
    }

}
