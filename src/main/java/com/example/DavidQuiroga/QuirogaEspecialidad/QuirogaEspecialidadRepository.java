package com.example.DavidQuiroga.QuirogaEspecialidad;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuirogaEspecialidadRepository extends CrudRepository<QuirogaEspecialidad, Long> {
    List<QuirogaEspecialidad> findAll();
}
