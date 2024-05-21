package com.example.DavidQuiroga.QuirogaDoctor;

import com.example.DavidQuiroga.QuirogaEspecialidad.QuirogaEspecialidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class QuirogaDoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;
    public String licencia;

    @ManyToOne
    private QuirogaEspecialidad quirogaEspecialidad;
}

