package com.example.LeninMontalvo.MontalvoInscripcion;

import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface MontalvoInscripcionRepository    extends CrudRepository<MontalvoInscripcion, Long> {
    List<MontalvoInscripcion> findAll();
}

