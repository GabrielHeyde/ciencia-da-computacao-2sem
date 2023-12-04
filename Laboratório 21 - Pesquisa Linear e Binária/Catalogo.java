import java.util.ArrayList;
import java.util.Collections;

public class Catalogo {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        Collections.sort(produtos);
    }

    public Produto pesquisaProdutoPorNome(String nome) {
        int posicao = pesquisaBinária(produtos, nome);
        if (posicao != -1) {
            return produtos.get(posicao);
        } else {
            return null;
        }
    }

    private static int pesquisaBinária(ArrayList<Produto> arrei, String numero) {
        int inicio = 0;
        int fim = arrei.size() - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            int comparacao = arrei.get(meio).getNome().compareTo(numero);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public void executarPedido(String nomeProduto, int quantidadeDesejada) {

        int posicao = pesquisaBinária(produtos, nomeProduto);

        if (posicao != -1) {
            Produto produto = produtos.get(posicao);
            if (produto.getQuantidade() >= quantidadeDesejada) {
                produto.setQuantidade(produto.getQuantidade() - quantidadeDesejada);
                System.out.println("Seu pedido foi processado com sucesso!");
                System.out.println("O total à pagar é: R$ " + produto.getPreco() * quantidadeDesejada);
            }else{
                System.out.println("Lamentamos, mas não há estoque suficiente do produto " + produto.getNome());
            }
        }
    }

}
