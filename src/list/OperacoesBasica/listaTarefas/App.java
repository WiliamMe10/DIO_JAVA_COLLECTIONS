package list.OperacoesBasica.listaTarefas;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer compras");

        // Obtendo o número total de tarefas
        int numeroTotalTarefas = listaTarefas.obterNumeroTotalTarefas();
        System.out.println("Número total de tarefas: " + numeroTotalTarefas);

        // Obtendo descrições das tarefas
        List<String> descricoes = listaTarefas.obterDescricoesTarefas();
        System.out.println("Descrições das tarefas:");
        int counter = 1;
        for (String descricao : descricoes) {
            System.out.println("Tarefa " + counter + ": " + descricao);
            counter++;
        }

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer compras");

        // Obtendo o número total de tarefas novamente
        numeroTotalTarefas = listaTarefas.obterNumeroTotalTarefas();
        System.out.println("\nNúmero total de tarefas após remoção: " + numeroTotalTarefas);
    }
}
