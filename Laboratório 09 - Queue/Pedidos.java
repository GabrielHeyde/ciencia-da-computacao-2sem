import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Pedidos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<String> pedidos = new LinkedList<>();
        
        Produto cachorroQuente = new Produto("Cachorro-Quente", 12.50);
        Produto hamburguer = new Produto("Hambúrguer", 15.00);
        Produto batataFrita = new Produto("Batata Frita", 7.50);
        Produto suco = new Produto("Suco", 5.00);
        Produto refrigerante = new Produto("Refrigerante", 6.50);

        while(true) {

            System.out.println("====================================================================================================================");
			System.out.println("PRODUTOS: ");
            System.out.println(cachorroQuente.getNome() + " - Preço: R$" + cachorroQuente.getPreco() + "0");
            System.out.println(hamburguer.getNome() + " - Preço: R$" + hamburguer.getPreco() + "0");
            System.out.println(batataFrita.getNome() + " - Preço: R$" + batataFrita.getPreco() + "0");
            System.out.println(suco.getNome() + " - Preço: R$" + suco.getPreco() + "0");
            System.out.println(refrigerante.getNome() + " - Preço: R$" + refrigerante.getPreco() + "0");
            System.out.println("====================================================================================================================");
            System.out.println("\nMenu de Opções: ");
			System.out.println("1. Exibir a fila de pedidos");
			System.out.println("2. Fazer Pedido");
			System.out.println("3. Liberar Pedido");
			System.out.println("0. Sair");
            System.out.println("====================================================================================================================");


			System.out.println("Digite a opção desejada: ");
			int opcao = scanner.nextInt();
            System.out.println("");

			switch (opcao) {
			case 1:
                if (pedidos.peek() != null) {
                    System.out.println("PEDIDOS NA FILA: ");
                    for (String clientes : pedidos) {
                        System.out.println(clientes + "\n");
                    }
                }
                else{
                    System.out.println("Nenhum pedido na fila!\n");
                } 
                break;              
			case 2:
            double preco = 0;
            String itens = "";
				while (true) {
                    System.out.println("Digite o código do produto para adicioná-lo ao seu Pedido: \n1 - Cachorro-Quente \n2 - Hambúrguer \n3 - Batata Frita \n4 - Suco \n5 - Refrigerante \n0 - Encerrar Pedido");
                    int selecao = scanner.nextInt();
                    if(selecao == 1){
                        preco = preco + cachorroQuente.getPreco();
                        itens = itens + cachorroQuente.getNome() + "\n";
                        System.out.println("Item adicionado com sucesso!\n");
                    }
                    else if(selecao == 2){
                        preco = preco + hamburguer.getPreco();
                        itens = itens + hamburguer.getNome() + "\n";
                        System.out.println("Item adicionado com sucesso!\n");
                    }
                    else if(selecao == 3){
                        preco = preco + batataFrita.getPreco();
                        itens = itens + batataFrita.getNome() + "\n";
                        System.out.println("Item adicionado com sucesso!\n");
                    }
                    else if(selecao == 4){
                        preco = preco + suco.getPreco();
                        itens = itens + suco.getNome() + "\n";
                        System.out.println("Item adicionado com sucesso!\n");
                    }
                    else if(selecao == 5){
                        preco = preco + refrigerante.getPreco();
                        itens = itens + refrigerante.getNome() + "\n";
                        System.out.println("Item adicionado com sucesso!\n");
                    }
                    else if (selecao == 0) {
                        System.out.println("Pedido realizado com sucesso!");
                        break;
                    }      
                    else{
                        System.out.println("Valor inválido!");
                    }               
                    }
                    String lancar = itens + "\nTOTAL: R$" + preco + "0";
                    pedidos.add(lancar);
                    break;
                
			case 3:
                if (pedidos.peek() != null) {
                    System.out.println("Pedido Liberado!");
                    System.out.println(pedidos.peek());
                    pedidos.remove();
                }
                else{
                    System.out.println("Nenhum pedido na fila!");
                }
                break;
				
			case 0:
				System.out.println("Finalizando programa");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Opção inválida!");
			}

        }

    }
}