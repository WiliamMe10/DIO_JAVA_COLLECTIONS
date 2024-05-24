package list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> list = new ArrayList<>();

    public void adicionarNumero(int numero){
            this.list.add(numero);
    }

    public List<Integer> ordernarAscendente(){
        List<Integer> ascList = new ArrayList<>(this.list);
        Collections.sort(ascList);
        return ascList;
    }

    public List<Integer> ordernarDescendente(){
        List<Integer> descList = new ArrayList<>(this.list);
        descList.sort(Collections.reverseOrder());
        return descList;
    }

}
