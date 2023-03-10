package com.proyectoFinal.sistema.bibliotecario.repository;

import com.proyectoFinal.sistema.bibliotecario.entity.LibroEntregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntregadoRepository extends JpaRepository<LibroEntregado, Integer> {
}
