import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos alunos deseja ordenar? ");
		int nroAlunos = scanner.nextInt();
		scanner.nextLine();
		
		Aluno[] alunos = new Aluno[nroAlunos];
		for (int i = 0; i < nroAlunos; i++) {
			System.out.print("Nome do aluno " + (i+1) + ": ");
			String nome = scanner.nextLine();
			System.out.print("Grau A: ");
			double grauA = scanner.nextDouble();
			System.out.print("Grau B: ");
			double grauB = scanner.nextDouble();
			scanner.nextLine();
			alunos[i] = new Aluno(nome, grauA, grauB);
		}
		
		System.out.print("Deseja ordenar por nome, grauA ou grauB? ");
		String criterio = scanner.nextLine().toLowerCase();
		
		System.out.print("Ordenar em ordem crescente (S ou N)? ");
		boolean crescente = scanner.nextLine().equalsIgnoreCase("S");
		
		AlunoOrdenacao.selectionSort(alunos, criterio, crescente);
		
		System.out.println("Lista ordenada:");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		scanner.close();
	}

}
