package map.OperacoesBasicas.AgendaContatos;

public class App {

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wiliam", 992093922);
        agendaContatos.adicionarContato("Wesley", 988435018);
        agendaContatos.adicionarContato("Wevertom", 991318388);
        agendaContatos.adicionarContato("Jucilene", 962478393);
        agendaContatos.adicionarContato("Abel", 987451154);
        agendaContatos.adicionarContato("Teste", 999999999);
        agendaContatos.removerContato("Teste");

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa por Nome: " + agendaContatos.pesquisarPorNome("Wiliam"));


    }

}
