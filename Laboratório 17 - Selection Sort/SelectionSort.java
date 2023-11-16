public class SelectionSort {

	public static void main(String[] args) {

		int[] arrei = {23, 10, 2003, 20, 48};
		
		System.out.println("Array original:");
		imprimir(arrei);
		
		ordenarPorSelection(arrei);
		
		System.out.println("\nArray ordenado:");
		imprimir(arrei);

	}

	private static void ordenarPorSelection(int[] arrei) {
		
		int tamanho = arrei.length;
		
		for (int i = 0; i < tamanho - 1; i++) {
			
			int minIndex = i;
			
			for (int j = i + 1; j < tamanho; j++) {
				
				if (arrei[j] < arrei[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arrei[minIndex];
			arrei[minIndex] = arrei[i];
			arrei[i] = temp;			
		}
	}

	private static void imprimir(int[] arrei) {
		for (int i : arrei) {
			System.out.print(i + " ");
		}

	}

}
