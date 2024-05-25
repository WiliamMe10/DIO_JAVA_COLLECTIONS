package set.OperecoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> list = new HashSet<>();

    public void adicionarPalavra(String palavra)throws PalavraRepetidaException{
        if(!this.list.contains(palavra)){
            this.list.add(palavra);
        }else {
            throw new PalavraRepetidaException("A palavra ja esta na lista.");
        }
    }

    public void removerPalavra(String palavra) throws PalavraNaoEncontradaException{

        boolean removed = this.list.removeIf(item -> item.equals(palavra));

        if(!removed){
            throw new PalavraNaoEncontradaException("A palavra nao foi encontada.");
        }

    }

    public boolean verificarPalavra(String palavra){
        return this.list.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        for(String palavra : this.list){
            System.out.println("Palavra: " + palavra);
        }
    }


}
