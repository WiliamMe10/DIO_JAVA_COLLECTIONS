package set.Ordenacao.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;
import java.lang.Comparable;

public class Produto implements Comparable<Produto> {

    private String  nome;

    private double preco;

    private Long cod;

    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(nome, produto.nome) && Objects.equals(cod, produto.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, cod, quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Long getCod() {
        return cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }
}

class CompararPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}