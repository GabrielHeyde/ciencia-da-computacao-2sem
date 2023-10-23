import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Exercício2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SortedMap<String, Double> ClientesNome = new TreeMap<>();
        SortedMap<Double, String> ClientesSaldo = new TreeMap<>(Collections.reverseOrder());

        while (true) {
            System.out.println(
                    "MENU\nBem-Vindo ao sistema de cadastro e consulta de clientes!\nDigite 1 para cadastrar um novo cliente\nDigite 2 para exibir a lista de clientes em ordem alfabética\nDigite 3 para exibir a lista de clientes em ordem crescente de saldo na conta\nDigite 0 para encerrar o programa");
            System.out.println("\nDigite o valor desejado: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente que será cadastrado: ");
                    String nome = scanner.next();
                    System.out.println("Digite o saldo na conta de " + nome);
                    double saldo = scanner.nextDouble();
                    ClientesNome.put(nome, saldo);
                    ClientesSaldo.put(saldo, nome);
                    System.out.println("Cliente cadastrado com sucesso!\n");
                    break;

                case 2:
                    for (SortedMap.Entry<String, Double> par : ClientesNome.entrySet()) {
                        System.out.println(par.getKey() + " - Saldo na conta : R$ " + par.getValue());
                    }
                    System.out.println(' ');
                    break;

                case 3:
                    for (SortedMap.Entry<Double, String> par : ClientesSaldo.entrySet()) {
                        System.out.println(par.getValue() + " - Saldo na conta : R$ " + par.getKey());
                    }
                     System.out.println(' ');

                    break;

                case 0:
                    System.out.println("Muito obrigado por utilizar nosso programa! Estamos encerrando-o...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente...");
                    break;
            }
        }

    }
}
