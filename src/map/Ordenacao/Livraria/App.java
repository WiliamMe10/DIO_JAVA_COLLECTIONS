package map.Ordenacao.Livraria;

public class App {

    public static void main(String[] args) {
        LivrariaOnlne livraria = new LivrariaOnlne();

        livraria.adicionarLivro("link1", "Livro A", "Autor X", 25.0);
        livraria.adicionarLivro("link2", "Livro B", "Autor Y", 30.0);
        livraria.adicionarLivro("link3", "Livro C", "Autor Z", 20.0);
        livraria.adicionarLivro("link4", "Livro D", "Autor X", 35.0);
        livraria.adicionarLivro("link5", "Livro E", "Autor P", 12.0);

        System.out.println("Livros disponíveis antes da remoção:");
        livraria.exibirLivrosOrdenadosPorPreco();

        livraria.removerLivro("Livro B");

        System.out.println("\nLivros disponíveis após a remoção:");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nLivros por autor:");
        livraria.pesquisarLivrosPorAutor("Autor X");

        System.out.println("\nLivro mais caro:");
        livraria.obterLivroMaisCaro();

        System.out.println("\nLivro mais barato:");
        livraria.exibirLivroMaisBarato();
    }
}


