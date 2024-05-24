package list.search.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> list = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        this.list.add(livro);
    }

    List<Livro> pesquisarPorAutor(String autor){
        return this.list.stream().filter(item -> item.getAutor().equals(autor)).toList();
    }

    List<Livro> pesquisarPorTitulo(String titulo){
        return this.list.stream().filter(item -> item.getTitulo().equals(titulo)).toList();
    }

    List<Livro> pesquisarPorAnoPublicacao(int anoInicial, int anoFinal){
       return this.list.stream().filter(item -> item.getAnoPublicacao() >= anoInicial && item.getAnoPublicacao() <= anoFinal).toList();
    } 

}
