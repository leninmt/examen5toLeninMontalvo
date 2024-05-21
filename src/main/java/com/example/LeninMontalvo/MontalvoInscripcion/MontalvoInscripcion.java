package com.example.LeninMontalvo.MontalvoInscripcion;

import com.example.LeninMontalvo.MontalvoEstudiante.MontalvoEstudiante;
import com.example.LeninMontalvo.MontalvoCurso.MontalvoCurso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class MontalvoInscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fechaInscripcion;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", referencedColumnName = "id")
    private MontalvoEstudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "curso_id", referencedColumnName = "id")
    private MontalvoCurso curso;
}