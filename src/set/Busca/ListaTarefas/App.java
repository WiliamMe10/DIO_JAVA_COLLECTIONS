package set.Busca.ListaTarefas;

import java.util.Set;

public class App {
    public static void main(String[] args) throws TarefaNaoExiste {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Comer jambroba");
        listaTarefa.adicionarTarefa("Comer picibiroba");

        listaTarefa.exibirTarefas();

        listaTarefa.marcarTarefaConcluida("Comer jambroba");

        Set<Tarefa> tarefasConcluidas = listaTarefa.obterTarefasConcluidas();
        Set<Tarefa> tarefasPendentes = listaTarefa.obterTarefasPendentes();

        listaTarefa.exibirTarefas(tarefasConcluidas);
        listaTarefa.exibirTarefas(tarefasPendentes);

        int size = listaTarefa.contarTarefas();

        System.out.println("Tamanho da Lista: " + size);

    }

}
