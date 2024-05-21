package com.example.DavidQuiroga.QuirogaEnfermera;

import java.math.BigDecimal;
import java.sql.Date;

import com.example.DavidQuiroga.QuirogaEspecialidad.QuirogaEspecialidad;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class QuirogaEnfermera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;
    public Boolean experiencia;
    public Date salida;
    public BigDecimal sueldo;

    @ManyToOne
    private QuirogaEspecialidad quirogaEspecialidad;
}
