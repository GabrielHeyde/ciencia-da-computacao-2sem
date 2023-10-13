import java.util.Scanner;
import java.util.Stack;

public class Exercício1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<String> produtos = new Stack<>();

        while (true) {
            System.out.println(
                    "=== MENU DA PILHA === \n1 - Adicionar Elemento \n2 - Remover Elemento \n3 - Imprimir Elemento \n4 - Verificar Tamanho da Pilha \n0 - Sair do Programa\n");
            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.println("Escreva o produto que você deseja adicionar à pilha: ");
                    String p = scanner.next();
                    produtos.push(p);
                    System.out.println("Produto adicionado com sucesso!\n");
                    break;

                case 2:
                    if (produtos.size() != 0) {
                        String removido = produtos.pop();
                        System.out.println(removido);
                        System.out.println("O produto acima foi removido com sucesso da pilha!\n");
                    } else {
                        System.out.println("Sua pilha está vazia.");
                    }
                    break;

                case 3:
                    if (produtos.size() != 0) {
                        int contador = 1;
                        for (String prod : produtos) {
                            System.out.println(contador + "º Produto: " + prod);
                            contador++;
                        }
                    } else {
                        System.out.println("Sua pilha está vazia.");
                    }
                    System.out.println("");
                    break;

                case 4:
                    int tamanhoPilha = produtos.size();
                    System.out.println("A pilha possui " + tamanhoPilha + " elementos.\n");
                    break;

                case 0:
                    scanner.close();
                    System.out.println("Programa encerrado...");
                    System.exit(0);
                    ;

                default:
                    System.err.println("Opção inválida!\n");
            }
        }
    }

}