package set.Busca.ListaTarefas;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefa {


    private Set<Tarefa> list = new HashSet<>();

    /**
     * Adds a new task to the task list.
     *
     * @param descricao the description of the new task.
     */
    public void adicionarTarefa(String descricao){
        Tarefa novaTarefa = new Tarefa(descricao);
        this.list.add(novaTarefa);
    }

    /**
     * Removes a task from the list based on its description.
     *
     * @param descricao The description of the task to be removed.
     * @throws TarefaNaoExiste If no task with the given description is found in the list.
     */
    public void removerTarefa(String descricao) throws TarefaNaoExiste {
        Tarefa novaTarefa = new Tarefa(descricao);
        boolean removed = this.list.remove(novaTarefa);
        if(!removed){
            throw new TarefaNaoExiste();
        }
    }

    /**
     * Displays all tasks in the list with their descriptions and statuses.
     */
    public void exibirTarefas(){
        for(Tarefa tarefa : this.list){
            System.out.println("Tarefa: " + tarefa.getDescricao() + ", Status: " +  (tarefa.isConcluido()  ? "Concluido" : "Pendente"));
        }
    }

    /**
     *  Displays the tasks in the provided set with their descriptions and statuses.
     *
     * @param tarefas A set of Tasks to be displayed.
     */
    public void exibirTarefas(Set<Tarefa> tarefas){
        for(Tarefa tarefa : tarefas){
            System.out.println("Tarefa: " + tarefa.getDescricao() + ", Status: " +  (tarefa.isConcluido()  ? "Concluido" : "Pendente"));
        }
    }

    /**
     *  Returns the number of tasks in the list.
     *
     * @return int The number of tasks in the list.
     */
    public int contarTarefas(){
        return this.list.size();
    }

    /**
     *  Returns A set containing all the completed taks.
     *
     * @return A set containing all the completed taks.
     */
    public Set<Tarefa> obterTarefasConcluidas(){
        return this.list.stream().filter(Tarefa::isConcluido).collect(Collectors.toSet());
    }

    /**
     *  Returns A set containing all the pending taks.
     *
     * @return A set containing all the pending taks.
     */
    public Set<Tarefa> obterTarefasPendentes(){
        return this.list.stream().filter(item -> !item.isConcluido()).collect(Collectors.toSet());
    }

    /**
     * Marks a task as completed based on its description.
     *
     * @param descricao The description of the task to be marked as completed.
     * @throws TarefaNaoExiste If no task with the given description is found in the list.
     */
    public void marcarTarefaConcluida(String descricao) throws TarefaNaoExiste {

        Optional<Tarefa> tarefa = this.list.stream().filter(item -> item.getDescricao().equals(descricao)).findFirst();

        if(tarefa.isEmpty()){
            throw new TarefaNaoExiste();
        }

        tarefa.get().setConcluido(true);
    }

    /**
     * Marks a task as pending based on its description.
     *
     * @param descricao The description of the task to be marked as pending.
     * @throws TarefaNaoExiste If no task with the given description is found in the list.
     */
    public void marcarTarefaPendente(String descricao) throws TarefaNaoExiste {

        Optional<Tarefa> tarefa = this.list.stream().filter(item -> item.getDescricao().equals(descricao)).findFirst();

        if(tarefa.isEmpty()){
            throw new TarefaNaoExiste();
        }

        tarefa.get().setConcluido(false);
    }

    /**
     * Cleard the task list.
     */
    public void limparListaTarefas(){
        this.list = new HashSet<>();
    }

}
