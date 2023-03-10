package com.proyectoFinal.sistema.bibliotecario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LibroEntregado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String libro;
    private String fechaPrestamo;
    private String fechaMaxDevolucion;
    private String namePrestatario;
}
