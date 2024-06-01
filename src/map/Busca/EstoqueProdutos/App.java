package map.Busca.EstoqueProdutos;

public class App {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adicionando produtos
        estoque.adicionarProduto(1L, "Teclado", 50, 120.99);
        estoque.adicionarProduto(2L, "Mouse", 100, 59.49);
        estoque.adicionarProduto(3L, "Monitor", 30, 899.90);
        estoque.adicionarProduto(4L, "Impressora", 10, 1500.00);

        // Exibindo todos os produtos
        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        // Obter e exibir o produto mais caro
        try {
            Produto maisCaro = estoque.obterProdutoMaisCaro();
            System.out.println("Produto mais caro: " + maisCaro.getNome() + " com preço de " + maisCaro.getPreco());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Obter e exibir o produto mais barato
        try {
            Produto maisBarato = estoque.obterProdutoMaisBarato();
            System.out.println("Produto mais barato: " + maisBarato.getNome() + " com preço de " + maisBarato.getPreco());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Obter e exibir o produto com maior valor total no estoque
        try {
            Produto maiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
            System.out.println("Produto com maior valor total no estoque: " + maiorQuantidadeValorTotal.getNome() + " com valor total de " + (maiorQuantidadeValorTotal.getPreco() * maiorQuantidadeValorTotal.getQuantidade()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
