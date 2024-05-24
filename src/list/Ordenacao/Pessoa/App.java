package list.Ordenacao.Pessoa;

import java.util.List;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas
        ordenacaoPessoa.adicionarPessoa("João", 25, 1.75);
        ordenacaoPessoa.adicionarPessoa("Maria", 30, 1.65);
        ordenacaoPessoa.adicionarPessoa("Pedro", 20, 1.80);

        // Ordenando por idade
        System.out.println("Ordenado por idade:");
        List<Pessoa> listaOrdenadaPorIdade = ordenacaoPessoa.ordernarPorIdade();
        for (Pessoa pessoa : listaOrdenadaPorIdade) {
            System.out.println(pessoa);
        }

        // Ordenando por altura
        System.out.println("\nOrdenado por altura:");
        List<Pessoa> listaOrdenadaPorAltura = ordenacaoPessoa.ordernarPorAltura();
        for (Pessoa pessoa : listaOrdenadaPorAltura) {
            System.out.println(pessoa);
        }
    }
}
