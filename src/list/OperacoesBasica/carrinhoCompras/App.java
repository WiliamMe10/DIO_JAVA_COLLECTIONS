package list.OperacoesBasica.carrinhoCompras;

import java.text.DecimalFormat;

public class App {
    
    public static void main(String[] args){

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("JAMBROBA", 11, 23.50);
        carrinhoDeCompras.adicionarItem("PICIBIROBA", 5, 17.50);
        carrinhoDeCompras.adicionarItem("JAMELÃO", 2, 8.50);
        carrinhoDeCompras.adicionarItem("PEPINO DO IMALAIA", 200, 1.50);

        carrinhoDeCompras.removerItem("PEPINO DO IMALAIA");

        carrinhoDeCompras.exibirItens();

        DecimalFormat formatter = new DecimalFormat("R$ #,##0.00");

        System.out.println("--------------------------------");
        System.out.println("Valor total: " + formatter.format(carrinhoDeCompras.calcularValorTotal()));
        System.out.println("--------------------------------");
    }

}
