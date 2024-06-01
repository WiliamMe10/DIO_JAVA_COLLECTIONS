package map.OperacoesBasicas.Dicionario;

public class App {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Casa", "Edifício destinado a habitação.");
        dicionario.adicionarPalavra("Carro", "Veículo automotor destinado ao transporte terrestre de pessoas.");

        System.out.println("Palavras no dicionário:");
        dicionario.exibirPalavras();

        try {
            String definicao = dicionario.pesquisarPorPalavra("Casa");
            System.out.println("Definição de 'Casa': " + definicao);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Removendo uma palavra
        dicionario.removerPalavra("Carro");

        // Tentando pesquisar uma palavra removida
        try {
            String definicao = dicionario.pesquisarPorPalavra("Carro");
            System.out.println("Definição de 'Carro': " + definicao);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Exibindo todas as palavras após remoção
        System.out.println("Palavras no dicionário após remoção:");
        dicionario.exibirPalavras();
    }
}
