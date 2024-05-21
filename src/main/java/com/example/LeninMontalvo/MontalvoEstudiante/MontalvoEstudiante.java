package com.example.LeninMontalvo.MontalvoEstudiante;
import com.example.LeninMontalvo.MontalvoInscripcion.MontalvoInscripcion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;


@Data
@Entity
public class MontalvoEstudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;
    public Number cedula;
    public LocalDate fechaNacimiento;

  

     @OneToMany(mappedBy = "estudiante")
    private List<MontalvoInscripcion> inscripciones;


}
