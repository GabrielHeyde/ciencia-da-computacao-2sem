import java.util.Scanner;
import java.util.Stack;

public class Exercício2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Registro> registros = new Stack<>();

        while (true) {
            System.out.println(
                    "=== MENU DA PILHA === \n1 - Inserir Registro \n2 - Remover Registro \n3 - Imprimir Elemento \n4 - Verificar Tamanho da Pilha \n0 - Sair do Programa\n");
            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.println("Escreva a classe: ");
                    String p = scanner.next();
                    System.out.println("Escreva o método: ");
                    String q = scanner.next();
                    System.out.println("Escreva o número da linha: ");
                    int r = scanner.nextInt();
                    Registro registro = new Registro(p, q, r);
                    registros.push(registro);
                    System.out.println("Registro adicionado com sucesso!\n");
                    break;

                case 2:
                    if (registros.size() != 0) {
                        Registro reg = registros.pop();
                        System.out.println(reg.toString());
                        System.out.println("O registro acima foi removido com sucesso da pilha!\n");
                    } else {
                        System.out.println("Sua pilha está vazia.");
                    }
                    break;

                case 3:
                    if (registros.size() != 0) {
                        for (Registro regist : registros) {
                            System.out.println(regist.toString());
                        }
                    } else {
                        System.out.println("Sua pilha está vazia.");
                    }
                    System.out.println("");
                    break;

                case 4:
                    int tamanhoPilha = registros.size();
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
