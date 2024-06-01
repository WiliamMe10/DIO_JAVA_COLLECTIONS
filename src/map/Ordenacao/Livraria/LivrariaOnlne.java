package map.Ordenacao.Livraria;

import java.util.*;

public class LivrariaOnlne {

    private Map<String, Livro> livrosDisponiveis = new HashMap<>();


    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosDisponiveis.put(link,  new Livro(titulo, autor, preco));
    }


    public void removerLivro(String titulo) {
       this.livrosDisponiveis.entrySet().removeIf(item -> item.getValue().getTitulo().equals(titulo));
    }

    public void exibirLivrosOrdenadosPorPreco(){

        Set<Map.Entry<String, Livro>> sortedset = new TreeSet<Map.Entry<String, Livro>>(new ComparatorPorPreco());

        sortedset.addAll(livrosDisponiveis.entrySet());

        sortedset.forEach(item -> {
            System.out.println("Link:" + item.getKey() + ", Titulo:" + item.getValue().getTitulo() + " Autor:" + item.getValue().getAutor() + ", Preço: "  + item.getValue().getPreco());
        });
    }

    public void pesquisarLivrosPorAutor(String autor){

        List<Map.Entry<String, Livro>> livrosPorAutor = this.livrosDisponiveis.entrySet().stream().filter(item -> item.getValue().getAutor().equals(autor)).toList();

        livrosPorAutor.forEach(item -> {
            System.out.println("Link:" + item.getKey() + ", Titulo:" + item.getValue().getTitulo() + " Autor:" + item.getValue().getAutor() + ", Preço: "  + item.getValue().getPreco());
        });
    }

    public void obterLivroMaisCaro(){

        Optional<Livro> livroMaisCaro = this.livrosDisponiveis.values().stream().max(Comparator.comparingDouble(Livro::getPreco));

        if(livroMaisCaro.isEmpty()){
            throw new RuntimeException("Livraria vazia");
        }

        System.out.println("Titulo:" + livroMaisCaro.get().getTitulo() + " Autor:" + livroMaisCaro.get().getAutor() + ", Preço: "  + livroMaisCaro.get().getPreco());
    }

    public void exibirLivroMaisBarato(){

        Optional<Livro> livroMaisBarato = this.livrosDisponiveis.values().stream().min(Comparator.comparingDouble(Livro::getPreco));

        if(livroMaisBarato.isEmpty()){
            throw new RuntimeException("Livraria vazia");
        }

        System.out.println("Titulo:" + livroMaisBarato.get().getTitulo() + " Autor:" + livroMaisBarato.get().getAutor() + ", Preço: "  + livroMaisBarato.get().getPreco());
    }

}

