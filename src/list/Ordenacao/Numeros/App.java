package list.Ordenacao.Numeros;

import java.util.List;

public class App {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Adicionando números
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(1);

        // Ordenando em ordem ascendente
        System.out.println("Ordenado em ordem ascendente:");
        List<Integer> listaAscendente = ordenacaoNumeros.ordernarAscendente();
        for (Integer numero : listaAscendente) {
            System.out.println(numero);
        }

        // Ordenando em ordem descendente
        System.out.println("\nOrdenado em ordem descendente:");
        List<Integer> listaDescendente = ordenacaoNumeros.ordernarDescendente();
        for (Integer numero : listaDescendente) {
            System.out.println(numero);
        }
    }
}
