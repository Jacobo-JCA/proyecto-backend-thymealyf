package com.proyectoFinal.sistema.bibliotecario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Afiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int credencial;
    private String name;
    private String direccion;
    private String tipoAfiliacion;
}
