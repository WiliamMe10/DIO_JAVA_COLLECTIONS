package map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        if (data.isBefore(LocalDate.now())) {
            throw new RuntimeException("Data invalida");
        }
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println("Agenda de Eventos:");
        this.eventos.forEach((key, value) -> {
            System.out.println(key + ": " + value.getNome() + " - Atração: " + value.getAtracao());
        });
    }

    public Evento obterProximoEvento() {
        System.out.println("Proximo Evento:");

        if (eventos.isEmpty()) {
            System.out.println("Não há eventos na agenda.");
            return null;
        }

        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(this.eventos);
        LocalDate dataProximoEvento = eventosOrdenados.keySet().iterator().next();
        Evento proximoEvento = eventosOrdenados.get(dataProximoEvento);
        System.out.println(dataProximoEvento + ": " + proximoEvento.getNome() + " - Atração: " + proximoEvento.getAtracao());
        return proximoEvento;
    }
}