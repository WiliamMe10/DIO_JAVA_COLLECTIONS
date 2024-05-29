package set.Ordenacao.CadastroProdutos;

public class App {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1981519815L, "TV BRABA", 2500.0,1);
        cadastroProdutos.adicionarProduto(118741118741L, "PC GAMER", 4500.0,1);
        cadastroProdutos.adicionarProduto(24654512465451L, "APPLE VISION PRO", 20000.0,1);
        cadastroProdutos.adicionarProduto(1981519815L, "MACBOOK AIR", 7500.0,1);

        System.out.println("Ordenados por nome: ");
        cadastroProdutos.exibirProdutosPorNome();
        System.out.println("Ordenados por preço: ");
        cadastroProdutos.exibirProdutosPorPreco();

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        long a = 9223372036854775806L;

    }

}
