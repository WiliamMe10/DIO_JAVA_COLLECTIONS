package list.search.catalogoLivros;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando livros
        catalogo.adicionarLivro(new Livro("Java: The Complete Reference", 2019, "Herbert Schildt"));
        catalogo.adicionarLivro(new Livro("Clean Code", 2008, "Robert C. Martin"));
        catalogo.adicionarLivro(new Livro("Head First Java", 2003, "Kathy Sierra, Bert Bates"));
        catalogo.adicionarLivro(new Livro("Effective Java", 2018, "Joshua Bloch"));
        catalogo.adicionarLivro(new Livro("Design Patterns", 1994, "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));
        catalogo.adicionarLivro(new Livro("Cracking the Coding Interview", 2019, "Gayle Laakmann McDowell"));
        catalogo.adicionarLivro(new Livro("Thinking in Java", 2006, "Bruce Eckel"));
        catalogo.adicionarLivro(new Livro("The Pragmatic Programmer", 1999, "Andrew Hunt, David Thomas"));
        catalogo.adicionarLivro(new Livro("Clean Architecture", 2017, "Robert C. Martin"));
        catalogo.adicionarLivro(new Livro("Refactoring", 1999, "Martin Fowler"));

        // Pesquisando por autor
        List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor("Robert C. Martin");
        System.out.println("Livros por Robert C. Martin:");
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro);
        }

        // Pesquisando por título
        List<Livro> livrosPorTitulo = catalogo.pesquisarPorTitulo("Clean Code");
        System.out.println("\nLivros com título Clean Code:");
        for (Livro livro : livrosPorTitulo) {
            System.out.println(livro);
        }

        // Pesquisando por ano de publicação
        List<Livro> livrosPorAno = catalogo.pesquisarPorAnoPublicacao(2000, 2010);
        System.out.println("\nLivros publicados entre 2000 e 2010:");
        for (Livro livro : livrosPorAno) {
            System.out.println(livro);
        }
    }
}
