import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos que você deseja adicionar ao seu Array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.print("\nDigite o valor que você deseja adicionar ao seu Array: ");
            int valor = scanner.nextInt();
            array[i] = valor;
        }

        scanner.close();

        int[] metade1 = new int[array.length/2];
        int[] metade2 = new int[array.length - array.length/2];

        System.arraycopy(array, 0, metade1, 0, metade1.length);
        System.arraycopy(array, metade1.length, metade2, 0, metade2.length);

        MinhaThread tarefa1 = new MinhaThread("Tarefa1", metade1);
        MinhaThread tarefa2 = new MinhaThread("Tarefa2", metade2);

        tarefa1.start();
        tarefa2.start();

        try {
            tarefa1.join();
            tarefa2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\nA soma dos elementos do Array informado é de " + (tarefa1.getResultado() + tarefa2.getResultado()));
        
    }

}
