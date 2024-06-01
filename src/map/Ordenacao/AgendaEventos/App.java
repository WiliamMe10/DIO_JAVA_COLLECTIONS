package map.Ordenacao.AgendaEventos;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 6, 1), "Concerto", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2028, 6, 3), "Festival", "Artista Y");
        agenda.adicionarEvento(LocalDate.of(2024, 6, 5), "Palestra", "Palestrante Z");
        agenda.adicionarEvento(LocalDate.of(2025, 7, 15), "Feira", "Expositor A");
        agenda.adicionarEvento(LocalDate.of(2028, 8, 20), "Workshop", "Facilitador B");
        agenda.adicionarEvento(LocalDate.of(3487, 1, 10), "Exposição", "Artista C");
        agenda.adicionarEvento(LocalDate.of(2246, 2, 25), "Evento", "Atração D");

        // Exibindo a agenda de eventos
        agenda.exibirAgenda();

        // Obtendo o próximo evento
        System.out.println("-------------------------------------");
        Evento proximoEvento = agenda.obterProximoEvento();

    }
}


