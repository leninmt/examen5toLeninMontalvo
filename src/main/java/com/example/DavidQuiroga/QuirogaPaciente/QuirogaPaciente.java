package com.example.DavidQuiroga.QuirogaPaciente;

import com.example.DavidQuiroga.QuirogaDoctor.QuirogaDoctor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class QuirogaPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public String name;
    public String email;

    @ManyToOne
    private QuirogaDoctor doctor;
}
