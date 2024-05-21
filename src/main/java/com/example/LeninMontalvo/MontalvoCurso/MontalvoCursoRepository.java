package com.example.LeninMontalvo.MontalvoCurso;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MontalvoCursoRepository  extends CrudRepository<MontalvoCurso, Long> {
    List<MontalvoCurso> findAll();
}
