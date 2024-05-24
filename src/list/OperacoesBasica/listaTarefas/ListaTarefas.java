package list.OperacoesBasica.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> list = new ArrayList<>();

    public  void adicionarTarefa(String descricao){
        this.list.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefas = this.list.stream().filter(item -> item.getDescricao().equals(descricao)).toList();
        
        for(Tarefa tarefa : tarefas){
            this.list.remove(tarefa);
        }
    }

    public int obterNumeroTotalTarefas(){
        return this.list.size();
    }

    public List<String> obterDescricoesTarefas(){
        return this.list.stream().map(Tarefa::getDescricao).toList();
    }

}
