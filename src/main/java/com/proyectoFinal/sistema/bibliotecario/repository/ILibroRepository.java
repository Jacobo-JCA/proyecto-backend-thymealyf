package com.proyectoFinal.sistema.bibliotecario.repository;

import com.proyectoFinal.sistema.bibliotecario.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Integer> {
}
