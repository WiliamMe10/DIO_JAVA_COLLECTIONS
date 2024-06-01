package map.Busca.EstoqueProdutos.ContagemPalavras;

public class App {
    public static void main(String[] args) {
        ContagemPalavras contador = new ContagemPalavras();

        // Adicionar palavras com suas contagens
        contador.adicionarPalavra("hello", 5);
        contador.adicionarPalavra("world", 3);
        contador.adicionarPalavra("java", 7);

        // Exibir contagem de palavras
        System.out.println("Contagem de Palavras:");
        contador.exibirContagemPalavras();

        // Remover uma palavra
        try {
            contador.removerPalavra("world");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Exibir contagem de palavras após a remoção
        System.out.println("\nContagem de Palavras após a remoção:");
        contador.exibirContagemPalavras();

        // Encontrar a palavra mais frequente
        try {
            String palavraMaisFrequente = contador.encontrarPalavraMaisFrequente();
            System.out.println("\nPalavra mais frequente: " + palavraMaisFrequente);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
