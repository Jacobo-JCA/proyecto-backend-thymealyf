package com.proyectoFinal.sistema.bibliotecario.controller;

import com.proyectoFinal.sistema.bibliotecario.entity.Libro;
import com.proyectoFinal.sistema.bibliotecario.interfazService.ILibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class LibroController {


    @Autowired
    ILibroService<Libro> libroService;

    @GetMapping("/formLibro")
    public String formLibro(Model model) {
        model.addAttribute("libro", new Libro());
        return "formLibro";
    }

    @GetMapping("/infoLibro")
    public String infoLibro(Model model) {
        List<Libro> libros = libroService.listarLibros();
        model.addAttribute("libros", libros);
        return "infoLibro";
    }

    @PostMapping("/save")
    public String save(@Valid Libro libro) {
        libroService.save(libro);
        return "redirect:/infoLibro";
    }

    @GetMapping("/editarLibro/{idLibro}")
    public String editarLibro(@PathVariable int idLibro, Model model) {
        Optional<Libro> libro = libroService.editarId(idLibro);
        model.addAttribute("libro", libro);
        return "formLibro";
    }

    @GetMapping("/delete/{idLibro}")
    public String delete(@PathVariable int idLibro) {
        libroService.delete(idLibro);
        return "redirect:/infoLibro";
    }
}
