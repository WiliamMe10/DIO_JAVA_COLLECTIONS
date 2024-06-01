package map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavras = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao){
        this.palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        this.palavras.remove(palavra);
        System.out.println("Palavra " + palavra + " removida com sucesso.");
    }

    public void exibirPalavras(){
        this.palavras.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }

    public String pesquisarPorPalavra(String palavra){
        var found = this.palavras.get(palavra);
        if(found == null){
            throw new RuntimeException("Palavra " + palavra + " não encontrada no dicionario.");
        }
        return found;
    }

}
