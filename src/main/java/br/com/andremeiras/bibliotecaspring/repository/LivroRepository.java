package br.com.andremeiras.bibliotecaspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andremeiras.bibliotecaspring.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    
    List<Livro> findByAutor(String autor);
    List<Livro> findByTitulo(String titulo);
    List<Livro> findByIsbn(String isbn);
}
