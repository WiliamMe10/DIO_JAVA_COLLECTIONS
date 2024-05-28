package set.Busca.ListaTarefas;

public class TarefaNaoExiste extends Exception{

    TarefaNaoExiste(){
        super("Tarefa não encontrada na lista");
    }

}
