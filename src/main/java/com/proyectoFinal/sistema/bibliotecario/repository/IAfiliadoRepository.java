package com.proyectoFinal.sistema.bibliotecario.repository;

import com.proyectoFinal.sistema.bibliotecario.entity.Afiliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAfiliadoRepository extends JpaRepository<Afiliado, Integer> {
}
