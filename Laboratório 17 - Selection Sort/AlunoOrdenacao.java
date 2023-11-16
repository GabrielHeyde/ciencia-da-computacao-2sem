public class AlunoOrdenacao {

	public static void selectionSort(Aluno[] alunos, String criterio, boolean crescente) {

		int tamanho = alunos.length;
		
		for (int i = 0; i < tamanho - 1; i++) {
			
			int minIndex = i;
			
			for (int j = i + 1; j < tamanho; j++) {
				
				if (criterio.equals("nome")) {
					if (alunos[j].getNome().compareTo(alunos[minIndex].getNome()) < 0 ^ !crescente) {
						minIndex = j;
					}
				} else if (criterio.equals("graua")) {
					if (alunos[j].getNotaA() < alunos[minIndex].getNotaA() ^ !crescente) {
						minIndex = j;
					}
				} else if (criterio.equals("graub")) {
					if (alunos[j].getNotaB() < alunos[minIndex].getNotaB() ^ !crescente) {
						minIndex = j;
					}					
				}
			}
			
			Aluno temp = alunos[minIndex];
			alunos[minIndex] = alunos[i];
			alunos[i] = temp;			
		}		
	}
}
