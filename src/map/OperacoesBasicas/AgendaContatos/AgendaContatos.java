package map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> listaContatos = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone){
        this.listaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
      var removed =   this.listaContatos.remove(nome);
      if(removed == null){
          throw new RuntimeException("Contato nao existe.");
      }
    }

    public void exibirContatos(){
        this.listaContatos.forEach((key, value) -> System.out.println("Nome: " + key + ", Telefone: " + value));
    }

    public Integer pesquisarPorNome(String nome){
        var found =  this.listaContatos.get(nome);
        if(found == null){
            throw new RuntimeException("Contato não existe.");
        }
        return found;
    }


}
