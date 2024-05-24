package list.OperacoesBasica.carrinhoCompras;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> list = new ArrayList<>();

    public void adicionarItem(String nome, int quantidade, double preco) {
        this.list.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome){

        List<Item> itens = this.list.stream().filter(item -> item.getNome().equals(nome)).toList();

        for(Item item : itens){
            this.list.remove(item);
        }        
    }

    public double calcularValorTotal(){
        return this.list.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();
    }

    public void exibirItens(){
        int counter = 1;

        DecimalFormat formatter = new DecimalFormat("R$ #,##0.00");

        for(Item item : this.list){
            System.out.println("--------------------------------");
            System.out.println("Item " + counter);
            System.out.println("Nome: " + item.getNome());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Preço: " + formatter.format(item.getPreco()));
            System.out.println("Sub-Total: " + formatter.format(item.getPreco() * item.getQuantidade()));
            counter++;
        }
    }

}
