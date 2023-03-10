package com.proyectoFinal.sistema.bibliotecario.controller;

import com.proyectoFinal.sistema.bibliotecario.entity.LibroEntregado;
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
public class EntregaController {

    @Autowired
    ILibroService<LibroEntregado> libroService;

    @GetMapping("/listarEntregas")
    public String listarEntregas(Model model) {
        List<LibroEntregado> prestados = libroService.listarLibros();
        model.addAttribute("prestados", prestados);
        return "infoEntrega";
    }

    @GetMapping("/crearEntrega")
    public String crearEntrega(Model model) {
        model.addAttribute("libroEntregado", new LibroEntregado());
        return "formEntrega";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid LibroEntregado libroEntregado) {
        libroService.save(libroEntregado);
        return "redirect:/listarEntregas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<LibroEntregado> libroEntregado = libroService.editarId(id);
        model.addAttribute("libroEntregado", libroEntregado);
        return "formEntrega";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable int id) {
        libroService.delete(id);
        return "redirect:/listarEntregas";
    }


}
