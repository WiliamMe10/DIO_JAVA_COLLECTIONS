package set.Busca.AgendaContatos;

public class App {
    public static void main(String[] args) throws ContatoRepetidoException, ContatoNaoEncontradoException {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wiliam", 992220154);
        agendaContatos.adicionarContato("Pedro", 987451544);
        agendaContatos.adicionarContato("Carlos", 97812254);
        agendaContatos.adicionarContato("Marcelo", 984223641);
        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Wiliam",992220150);

        agendaContatos.exibirContatos();

    }

}
