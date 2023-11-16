public class LivroOrdenacao {

	public static void insertionSort(Livro[] livros) {

		int tamanho = livros.length;

		for (int i = 1; i < tamanho; i++) {
			Livro chave = livros[i];
			int j = i - 1;

			while (j >= 0 &&
					(livros[j].getAno() < chave.getAno() ||
							(livros[j].getAno() == chave.getAno() &&
									livros[j].getNome().compareTo(chave.getNome()) > 0))) {
				livros[j + 1] = livros[j];
				j--;
			}

			livros[j + 1] = chave;
		}

	}

}
