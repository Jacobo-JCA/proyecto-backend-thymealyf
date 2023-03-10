package com.proyectoFinal.sistema.bibliotecario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLibro;
    private String name;
    private String autor;
    private String editorial;
    private String edicion;
    private String category;
    private int numCopias;
}
