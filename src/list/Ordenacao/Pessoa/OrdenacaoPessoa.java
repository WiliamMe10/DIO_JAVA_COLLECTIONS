package list.Ordenacao.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> list  = new ArrayList<>();
    
    public void adicionarPessoa(String nome, int idade, double altura){
        this.list.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> sortedList =  new ArrayList<Pessoa>(this.list);
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> sortedList =  new ArrayList<Pessoa>(this.list);
        Collections.sort(sortedList, new CompararPorAltura());
        return sortedList;
    }

}

class CompararPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}