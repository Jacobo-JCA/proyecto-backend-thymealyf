package com.proyectoFinal.sistema.bibliotecario.servicio;

import com.proyectoFinal.sistema.bibliotecario.entity.Libro;
import com.proyectoFinal.sistema.bibliotecario.interfazService.ILibroService;
import com.proyectoFinal.sistema.bibliotecario.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService<Libro> {

    @Autowired
    private ILibroRepository libroRepository;

    @Override
    public List<Libro> listarLibros() {
        return (List<Libro>) libroRepository.findAll();
    }

    @Override
    public Optional<Libro> editarId(int id) {
        return libroRepository.findById(id);
    }

    @Override
    public int save(Libro libro) {
        int respuesta = 0;
        Libro libro1 = libroRepository.save(libro);
        if (!libro1.equals(null)) {
            respuesta = 1;
        }
        return respuesta;
    }

    @Override
    public void delete(int id) {
        libroRepository.deleteById(id);
    }
}
