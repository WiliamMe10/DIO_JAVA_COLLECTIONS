package list.OperacoesBasica.carrinhoCompras;

public class Item {

    private String nome;
    private int quantidade;
    private double preco;

    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

}
