package br.com.andremeiras.bibliotecaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.andremeiras.bibliotecaspring.model.Livro;
import br.com.andremeiras.bibliotecaspring.repository.LivroRepository;

@Controller
@RequestMapping("/")
public class LivroController {
    
    private LivroRepository livroRepository;

    @Autowired
    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping(value = "/{autor}")
    public String listaLivros(@PathVariable("autor") String autor, Model model) {
        List<Livro> listaLivros = livroRepository.findByAutor(autor);
        if (listaLivros != null) {
            model.addAttribute("livros", listaLivros);
        }
        return "listaLivros";
    }

    @PostMapping(value = "/{autor}")
    public String adicionaLivroAutor(@PathVariable("autor") String autor, Livro livro) {
        livro.setAutor(autor);
        livroRepository.save(livro);
        return "redirect:/{autor}";
    }
    
}
