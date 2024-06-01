package map.Busca.EstoqueProdutos;

import javax.swing.text.html.Option;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class EstoqueProdutos    {

    Map<Long ,Produto> produtos = new HashMap();

    private final NumberFormat numberFormatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        this.produtos.forEach((key, value) -> {
            System.out.println("Cod: " + key + ", Nome: " + value.getNome() + ", Quantidade: " + value.getQuantidade() + ", Preço: " + numberFormatter.format(value.getPreco()));
        });
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = this.produtos.values().stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();
        System.out.println("Valor total do estoque:" + numberFormatter.format(valorTotal) );
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        // Use streams to find the product with the highest price
        Optional<Produto> produtoMaisCaro = this.produtos.values().stream()
                .max(Comparator.comparingDouble(Produto::getPreco));

        // Return the product if present, otherwise return null
        return produtoMaisCaro.orElseThrow( () -> new RuntimeException("Nenhum produto disponivel no estoque."));
    }

    public Produto obterProdutoMaisBarato(){
        Optional<Produto> produtoMaisBarato = this.produtos.values().stream()
                .min(Comparator.comparingDouble(Produto::getPreco));

        return produtoMaisBarato.orElseThrow(() -> new RuntimeException("Nenhum produto disponivel no estoque."));
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Optional<Produto> produtoMaiorQuantidade = this.produtos.values().stream()
                .max(Comparator.comparingDouble( item -> item.getPreco() * item.getQuantidade()));

        return produtoMaiorQuantidade.orElseThrow(() -> new RuntimeException("Nenhum produto disponivel no estoque."));
    }

}
