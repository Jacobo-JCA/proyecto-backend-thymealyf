package com.proyectoFinal.sistema.bibliotecario.servicio;

import com.proyectoFinal.sistema.bibliotecario.entity.LibroEntregado;
import com.proyectoFinal.sistema.bibliotecario.interfazService.ILibroService;
import com.proyectoFinal.sistema.bibliotecario.repository.IEntregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroEntregadoService implements ILibroService<LibroEntregado> {

    @Autowired
    private IEntregadoRepository entregadoRepository;
    @Override
    public List<LibroEntregado> listarLibros() {
        return (List<LibroEntregado>)entregadoRepository.findAll();
    }

    @Override
    public Optional<LibroEntregado> editarId(int id) {
        return entregadoRepository.findById(id);
    }

    @Override
    public int save(LibroEntregado libroEntregado) {
        int respuesta = 0;
        LibroEntregado libroEntregado1 = entregadoRepository.save(libroEntregado);
        if (!libroEntregado1.equals(null)) {
            respuesta = 1;
        }
        return respuesta;
    }

    @Override
    public void delete(int id) {
        entregadoRepository.deleteById(id);
    }
}
