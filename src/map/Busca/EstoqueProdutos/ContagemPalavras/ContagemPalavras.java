package map.Busca.EstoqueProdutos.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ContagemPalavras {

    private Map<String, Integer> palavras = new HashMap<>();

    public void  adicionarPalavra(String palavra, Integer contagem){
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
       var removed =  this.palavras.remove(palavra);
       if(removed == null){
           throw new RuntimeException("Palavra:" + palavra + " não encontrada.");
       }
        System.out.println("Palavra:" + palavra + " removida com sucesso.");
    }

    public void exibirContagemPalavras(){
        this.palavras.forEach((key, value) -> {
            System.out.println("Palavra:" + key + ", contagem:" + value);
        });
    }

    public String encontrarPalavraMaisFrequente() {
        Optional<Map.Entry<String, Integer>> palavraMaisFrequente = this.palavras.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return palavraMaisFrequente.map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("Nenhuma palavra adicionada."));
    }

}
