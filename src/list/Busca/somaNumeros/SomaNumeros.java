package list.Busca.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> list = new ArrayList<>();

    public void adicionarNumero(int numero) {
        this.list.add(numero);
    }

    public int somarNumeros() {
        return this.list.stream().mapToInt(item -> item).sum();
    }

    public int encontrarMaiorNumero(){
        return this.list.stream().mapToInt(item -> item).max().getAsInt();
    }

    public int encontrarMenorNumero(){
        return this.list.stream().mapToInt(item -> item).min().getAsInt();
    }

}
