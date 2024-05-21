package com.example.DavidQuiroga.QuirogaPaciente;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuirogaPacienteRepository extends CrudRepository<QuirogaPaciente, Long> {
    List<QuirogaPaciente> findAll();
}
