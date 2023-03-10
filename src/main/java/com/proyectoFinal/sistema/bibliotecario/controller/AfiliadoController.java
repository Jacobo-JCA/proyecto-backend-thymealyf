package com.proyectoFinal.sistema.bibliotecario.controller;

import com.proyectoFinal.sistema.bibliotecario.entity.Afiliado;
import com.proyectoFinal.sistema.bibliotecario.interfazService.ILibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class AfiliadoController {

    @Autowired
    ILibroService<Afiliado> libroService;

    @GetMapping("/listarAfiliados")
    public String listarAfiliados(Model model) {
        List<Afiliado> afiliados = libroService.listarLibros();
        model.addAttribute("afiliados", afiliados);
        return "infoAfiliados";
    }

    @GetMapping("/crearForm")
    public String crearForm(Model model) {
        model.addAttribute("afiliado", new Afiliado());
        return "formAfiliados";
    }

    @PostMapping("/almacenar")
    public String guardar(@Valid Afiliado afiliado) {
        libroService.save(afiliado);
        return "redirect:/listarAfiliados";
    }
    //para editar no ponemos la ruta si no el nombre del html en este caso formAfiliados
    @GetMapping("/edit/{id}")
    public String editarAfiliado(@PathVariable int id, Model model) {
        Optional<Afiliado> afiliado = libroService.editarId(id);
        model.addAttribute("afiliado", afiliado);
        return "formAfiliados";
    }

    @GetMapping("/del/{credencial}")
    public String del(@PathVariable int credencial) {
        libroService.delete(credencial);
        return "redirect:/listarAfiliados";
    }


}
