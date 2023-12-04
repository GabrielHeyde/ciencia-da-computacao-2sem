public class TesteProdutos {

    public static void main(String[] args) {
        
        Catalogo catalogo = new Catalogo();

        Produto produto1 = new Produto("Notebook", 2200.0, 10);
        Produto produto2 = new Produto("Smartphone", 1800.0, 25);
        Produto produto3 = new Produto("Tablet", 1500, 15);

        catalogo.adicionarProduto(produto1);
        catalogo.adicionarProduto(produto2);
        catalogo.adicionarProduto(produto3);

        catalogo.executarPedido("Smartphone", 3);
        catalogo.executarPedido("Notebook", 2);
        catalogo.executarPedido("Tablet", 16);
        catalogo.executarPedido("Smartphone", 25);

    }
    
}
