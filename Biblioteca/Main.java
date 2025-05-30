package Biblioteca;

import java.util.*;
import java.util.stream.Collectors;

// Enum para Categorias
enum Categoria {
    AVENTURA,
    DRAMA,
    FICCAO,
    TERROR
}

// Classe Autor
class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Livro
class Livro {
    private String titulo;
    private Autor autor;
    private Categoria categoria;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor.getNome() + ", Categoria: " + categoria;
    }
}

// Classe SistemaBiblioteca
class SistemaBiblioteca {
    private List<Livro> livros = new ArrayList<>();

    // Método para adicionar livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Método para listar livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            livros.forEach(System.out::println);
        }
    }

    // Método para buscar por categoria
    public void buscarPorCategoria(Categoria categoria) {
        List<Livro> filtrados = livros.stream()
                .filter(l -> l.getCategoria() == categoria)
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("Nenhum livro encontrado para a categoria: " + categoria);
        } else {
            filtrados.forEach(System.out::println);
        }
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("Stephen King");

        Livro livro1 = new Livro("Harry Potter", autor1, Categoria.AVENTURA);
        Livro livro2 = new Livro("It", autor2, Categoria.TERROR);
        Livro livro3 = new Livro("O Iluminado", autor2, Categoria.TERROR);

        sistema.adicionarLivro(livro1);
        sistema.adicionarLivro(livro2);
        sistema.adicionarLivro(livro3);

        System.out.println("\nTodos os livros:");
        sistema.listarLivros();

        System.out.println("\nBuscar livros da categoria TERROR:");
        sistema.buscarPorCategoria(Categoria.TERROR);

        System.out.println("\nBuscar livros da categoria DRAMA:");
        sistema.buscarPorCategoria(Categoria.DRAMA);
    }
}
