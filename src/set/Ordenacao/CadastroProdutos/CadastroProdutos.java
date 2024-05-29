package set.Ordenacao.CadastroProdutos;

import java.util.*;

public class CadastroProdutos {

    private Set<Produto> list = new HashSet<>();

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        Produto novoProduto = new Produto(cod, nome, preco, quantidade);

        this.list.add(novoProduto);
    }

    public void exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(this.list);
        for(Produto produto : produtosPorNome){
            System.out.println("Cod:"+ produto.getCod() +
                                ", Nome: " + produto.getNome() +
                                ", Preço: " + produto.getPreco() +
                                ", Quantidade: " + produto.getQuantidade());
        }

    }

    public void exibirProdutosPorPreco(){
        Set<Produto> produtosPorNome = new TreeSet<>(new CompararPorPreco());
        produtosPorNome.addAll(this.list);
        for(Produto produto : produtosPorNome){
            System.out.println("Cod:"+ produto.getCod() +
                    ", Nome: " + produto.getNome() +
                    ", Preço: " + produto.getPreco() +
                    ", Quantidade: " + produto.getQuantidade());
        }

    }

}

