package com.proyectoFinal.sistema.bibliotecario.interfazService;

import com.proyectoFinal.sistema.bibliotecario.entity.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService<T> {

    public List<T> listarLibros();
    public Optional<T> editarId(int id);
    public int save(T libro);
    public void delete(int id);
}
